package tn.gov.sibtel.microone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
public class MicroOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroOneApplication.class, args);
    }

    @RestController
public class MessageController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from MicroOne";
    }
}
}


