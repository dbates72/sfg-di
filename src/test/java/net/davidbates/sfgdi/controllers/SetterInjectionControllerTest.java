package net.davidbates.sfgdi.controllers;

import net.davidbates.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectionControllerTest {
    SetterInjectionController controller;

    @BeforeEach
    void setup() {
        controller = new SetterInjectionController();
        controller.setGreetingService(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreetingService().sayGreeting());
    }
}