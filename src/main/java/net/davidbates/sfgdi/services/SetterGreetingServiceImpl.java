package net.davidbates.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World setter";
    }
}
