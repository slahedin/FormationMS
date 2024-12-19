package tn.gov.sibtel.microone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
public class MicrooneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrooneApplication.class, args);
	}
	@RestController
	public class HelloController {
	
		@GetMapping("/hello")
		public String hello() {
			return "Hello from microservice 1!";
		}
	}
}
