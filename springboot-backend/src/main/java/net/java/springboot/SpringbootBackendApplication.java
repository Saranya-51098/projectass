package net.java.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.java.springboot.module.User;
import net.java.springboot.respository.UserRespository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	
	@Autowired
	private UserRespository userRespository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.userRespository.save(new User("Nivedha","Saravanan","nivedha@gmail.com"));
		this.userRespository.save(new User("Pavithra","krishnan","pavithra@gmail.com"));
		this.userRespository.save(new User("Nalini","Rajendran","nalini@gmail.com"));
		this.userRespository.save(new User("Sharmila","Gowthaman","sharmi@gmail.com"));
		
	}

}
