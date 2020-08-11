package net.davidbates.sfgdi.controllers;

import net.davidbates.sfgdi.services.GreetingService;

public class SetterInjectionController {
    private GreetingService greetingService=null;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}

