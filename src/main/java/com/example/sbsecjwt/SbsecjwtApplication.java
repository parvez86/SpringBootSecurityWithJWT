package com.example.sbsecjwt;

import com.example.sbsecjwt.auth.AuthenticationService;
import com.example.sbsecjwt.auth.RegisterRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.example.sbsecjwt.entity.Role.*;

@SpringBootApplication
public class SbsecjwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbsecjwtApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(
//			AuthenticationService service
//	) {
//		return args -> {
//
//			var user = RegisterRequest.builder()
//					.firstname("S")
//					.lastname("P")
//					.email("sp86@gmail.com")
//					.password("sp86")
//					.role(USER)
//					.build();
//
//			System.out.println("User token: " + service.register(user).getAccessToken());
//
//			var admin = RegisterRequest.builder()
//					.firstname("Admin")
//					.lastname("Admin")
//					.email("admin@mail.com")
//					.password("password")
//					.role(ADMIN)
//					.build();
//
//			System.out.println("Admin token: " + service.register(admin).getAccessToken());
//
//			var manager = RegisterRequest.builder()
//					.firstname("Admin")
//					.lastname("Admin")
//					.email("manager@mail.com")
//					.password("password")
//					.role(MANAGER)
//					.build();
//			System.out.println("Manager token: " + service.register(manager).getAccessToken());
//
//
//			ObjectMapper mapper = new ObjectMapper();
//			System.out.println("role_user: "+ mapper.writeValueAsString(USER));
//			System.out.println("user: "+mapper.writeValueAsString(user));
//			System.out.println("admin: "+mapper.writeValueAsString(admin));
//			System.out.println("manager: "+mapper.writeValueAsString(manager));
//		};
//	}

}
