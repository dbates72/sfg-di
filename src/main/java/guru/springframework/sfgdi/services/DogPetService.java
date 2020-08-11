package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Profile({"dog", "default"})
@Primary
@Service("dog")
public class DogPetService implements PetService{

    public String getPetType(){
        return "Dogs are the best!";
    }
}