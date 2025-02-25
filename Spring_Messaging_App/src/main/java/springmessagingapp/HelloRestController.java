package springmessagingapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    // UC_1 Hello from BridgeLabz using GET request
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // UC_2 Hello with name passed as a query parameter
    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

}
