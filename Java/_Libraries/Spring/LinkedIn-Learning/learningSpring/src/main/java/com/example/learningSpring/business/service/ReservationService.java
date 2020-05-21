package com.example.learningSpring.business.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learningSpring.business.domain.RoomReservation;
import com.example.learningSpring.data.entity.Room;
import com.example.learningSpring.data.entity.Reservation;
import com.example.learningSpring.data.entity.Guest;
import com.example.learningSpring.data.repository.GuestRepository;
import com.example.learningSpring.data.repository.ReservationRepository;
import com.example.learningSpring.data.repository.RoomRepository;

@Service
public class ReservationService {
    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    public List<RoomReservation> getRoomReservationsForDate(Date date) {
        Iterable<Room> rooms = this.roomRepository.findAll();
        Map<Long, RoomReservation> roomReservations = new HashMap<>();
        rooms.forEach(room -> {
            RoomReservation reservation = new RoomReservation();
            reservation.setRoomId(room.getRoomId());
            reservation.setRoomName(room.getRoomName());
            reservation.setRoomNumber(room.getRoomNumber());
            roomReservations.put(room.getRoomId(), reservation);
        });

        Iterable<Reservation> reservations = this.reservationRepository.findReservationByReservationDate(new java.sql.Date(date.getTime()));
        reservations.forEach(reservation -> {
            RoomReservation roomReservation = roomReservations.get(reservation.getRoomId());
            roomReservation.setDate(date);
            Guest guest = this.guestRepository.findById(reservation.getGuestId()).get();
            roomReservation.setFirstName(guest.getGuestFirstName());
            roomReservation.setLastName(guest.getGuestLastName());
            roomReservation.setGuestId(guest.getGuestId());
        });

        List<RoomReservation> roomReservationList = new ArrayList<>();
        for (Long id: roomReservations.keySet()) {
            roomReservationList.add(roomReservations.get(id));
        }
        return roomReservationList;
    }

    public List<Guest> getHotelGuests() {
        Iterable<Guest> guests = this.guestRepository.findAll();
        List<Guest> guestList = new ArrayList<>();
        guests.forEach(guest -> {
            guestList.add(guest);
        });
        return guestList;
    }

}
