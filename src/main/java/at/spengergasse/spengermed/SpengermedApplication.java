package at.spengergasse.spengermed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


// prevent global 401 response
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpengermedApplication {

	// todo: Assignment
	// 1. Create a new Patient and Practitioner Entity
	// 1.a All their Sub-entities should be implemented as well
	// 2. Create a new Repository for each entity
	// 3. Create a new Controller for each entity
	// 4. Add a import.sql file to the resources folder
	// 4a. This file will initialize all the necessary test-data for further tests
	// 5. Add a new endpoint to both controllers, to get all entities
	// 6. Add a new endpoint to both controllers, to add a new entity
	// 7. Add a new endpoint to both controllers, to get a person by id
	// 8. Add a new endpoint to both controllers, to delete a entity by id
	// 9. Add a new endpoint to both controllers, to update a entity by id
	// 10. Add a new endpoint to both controllers, to get a entity by name


	// Here are some infos to get started: 
	// --> https://spring.io/guides/gs/accessing-data-jpa/


	public static void main(String[] args) {
		SpringApplication.run(SpengermedApplication.class, args);
	}
}
