package net.davidbates.sfgdi.controllers;

import net.davidbates.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {
    @Qualifier("setterGreetingServiceImpl")
    @Autowired
    private GreetingService greetingService=null;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public String getGreeting() {
        return getGreetingService().sayGreeting();
    }
}

