package org.sid;


import org.sid.dao.UserRepository;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsersApiApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(UsersApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		;
	}

}