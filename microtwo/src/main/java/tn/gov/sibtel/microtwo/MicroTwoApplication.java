package tn.gov.sibtel.microtwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MicroTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroTwoApplication.class, args);
    }
}

@RestController
class MessageController {

    @Autowired
    private MicroOneClient microOneClient;

    @GetMapping("/call-microone")
    public String callMicroOne() {
        return microOneClient.getHelloMessage();
    }
}
