package com.app.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.springboot.model.Bike;
import com.app.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new Bike("Bajaj","Avenger","220-cruise"));
		this.userRepository.save(new Bike("Bajaj","Avenger","220-street"));
		this.userRepository.save(new Bike("Yamaha","R-series","R3"));
		this.userRepository.save(new Bike("Yamaha","R-series","R1"));
		this.userRepository.save(new Bike("KTM","RC-series","RC 390"));
		this.userRepository.save(new Bike("KTM","RC-series","RC 200"));
		this.userRepository.save(new Bike("Kawasaki","Ninja","Ninja 300"));
		this.userRepository.save(new Bike("Kawasaki","Ninja","Ninja ZX-10R"));
		
	}

}
