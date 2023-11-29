package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Dog dog(){
        Dog dog = new Dog();
        dog.setName("Reks");
        return dog;
    }

    @Bean
    public People people(Dog dog){
        People people = new People();
        people.setName("Alex");
        people.setDog(dog);
        return people;
    }

}
