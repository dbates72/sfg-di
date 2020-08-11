package net.davidbates.sfgdi.controllers;

import net.davidbates.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("Hello World");
        return "Hi folks";
    }

    public String getGreeting() {
        return "Hello World primary";
    }


}
