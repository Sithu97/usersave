package net.java.springbootbackend;

import net.java.springbootbackend.model.User;
import net.java.springbootbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);

	}
	@Autowired
	 private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
//		User  user=new User();
//		user.setFirstName("Sithara");
//		user.setLastName("Sandeepani");
//		user.setEmailId("sithara@gmail.com");
//		userRepository.save(user);
//
//		User  user1=new User();
//		user1.setFirstName("Kalpani");
//		user1.setLastName("Udayangani");
//		user1.setEmailId("kalpani@gmail.com");
//		userRepository.save(user1);

}}
