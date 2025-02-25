package springmessagingapp;


import org.springframework.web.bind.annotation.*;

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
    // UC_3 Hello with name passed as a path variable
    @GetMapping("/param/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC_4 Hello with POST request and User DTO (firstName, lastName)
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    // UC_5 Hello with PUT request (firstName as Path Variable, lastName as Query Parameter)
    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
