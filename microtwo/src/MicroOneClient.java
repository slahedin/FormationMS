import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microone")
public interface MicroOneClient {

    @GetMapping("/hello")
    String getHelloMessage();
}