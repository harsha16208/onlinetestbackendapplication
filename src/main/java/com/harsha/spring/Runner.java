package com.harsha.spring;

import java.time.LocalDate;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.harsha.spring.models.Role;
import com.harsha.spring.models.User;
import com.harsha.spring.repositories.RoleRepository;
import com.harsha.spring.repositories.UserRepository;

@Component
public class Runner implements CommandLineRunner {
	
	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;
	
	private final static Logger LOGGER = Logger.getLogger(Runner.class);

	
	@Override
	public void run(String... args) throws Exception {
		roleRepository.save(new Role("ADMIN", "Can manage users"));
		roleRepository.save(new Role("ORG", "Can Create Exams for user"));
		roleRepository.save(new Role("CANDIDATE", "Can Write Exams"));
		
		Role adminRole = roleRepository.getById("ADMIN");
		
		userRepository.save(new User("gayathrithushara02@gmail.com", "$2a$10$eErQGDpctxn2tCvgCkcQF.fppM74B3HY2oKDxM0ZwG7uQ.eqxsTXO", adminRole, LocalDate.now()));

		
		LOGGER.info("created roles and admin");
	}

}
