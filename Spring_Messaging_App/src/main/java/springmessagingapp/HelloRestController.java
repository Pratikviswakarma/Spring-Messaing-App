package springmessagingapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    // UC_1 Hello from BridgeLabz using GET request
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
    
}
