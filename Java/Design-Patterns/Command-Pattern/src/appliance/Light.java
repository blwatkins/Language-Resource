package appliance;

public class Light {
    private boolean on;
    private String roomName;

    public Light(String roomName) {
        this.roomName = roomName;
    }

    public void turnOn() {
        on = true;
        System.out.println(getRoomName() + " light is on");
    }

    public void turnOff() {
        on = false;
        System.out.println(getRoomName() + " light is off");
    }

    public boolean isOn() {
        return on;
    }

    public String getRoomName() {
        return roomName;
    }
}
