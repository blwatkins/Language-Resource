package com.example.accessingdata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.accessingdata.data.entity.Customer;
import com.example.accessingdata.data.repository.CustomerRepository;

@SpringBootApplication
public class AccessingDataApplication {

	private static final Logger log = LoggerFactory.getLogger(AccessingDataApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository customerRepository) {
		return (args) -> {
			customerRepository.save(new Customer("Harry", "Potter"));
			customerRepository.save(new Customer("Ron", "Weasley"));
			customerRepository.save(new Customer("Hermione", "Granger"));
			customerRepository.save(new Customer("Ginny", "Weasley"));
			customerRepository.save(new Customer("Fred", "Weasley"));
			customerRepository.save(new Customer("George", "Weasley"));

			log.info("Customers found with findAll()");
			for (Customer customer: customerRepository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			log.info("Customer found by ID");
			Customer c = customerRepository.findById(1L).get();
			log.info(c.toString());
			log.info("");

			log.info("Customers found by last name");
			for (Customer customer: customerRepository.findByLastName("Weasley")) {
				log.info(customer.toString());
			}
			log.info("");
		};
	}



}
