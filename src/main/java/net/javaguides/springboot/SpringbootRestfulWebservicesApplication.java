package net.javaguides.springboot;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title = "Spring Boot REST API Documentation",
				description = "Spring Boot REST API Documentation",
				version="v1.0",
				contact=@Contact(
						name="Darshan",
						email = "darshanmangle07@gmail.com",
						url="www.linkedin.com/in/darshan-mangle-0183141a5"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot user management Documentation"
		)
)
public class SpringbootRestfulWebservicesApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulWebservicesApplication.class, args);
	}

}
