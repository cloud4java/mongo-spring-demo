package com.example.mongospringdemo;

import com.example.mongospringdemo.persistence.UserDomain;
import com.example.mongospringdemo.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableMongoRepositories
public class MongoSpringDemoApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoSpringDemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		UserDomain item =  new UserDomain(1,"Dorival Querino", LocalDateTime.now());
		userRepository.save(item);
	}
}
