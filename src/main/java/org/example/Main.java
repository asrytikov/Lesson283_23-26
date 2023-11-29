package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        People people = context.getBean(People.class);
        Dog dog = context.getBean(Dog.class);

        System.out.println("People's name: " + people.getName());
        System.out.println("Dog's name: " + dog.getName());
        System.out.println("People's dog " + people.getDog());

    }
}