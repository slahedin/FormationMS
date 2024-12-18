package tn.gov.sibtel.microone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class MicrooneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrooneApplication.class, args);
	}

}

