package clients.impl;

import clients.Animal;
import clients.Flyable;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Swimable {
    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);}
    @Override
    public void eat() {
        System.out.println("Утка щелокчет");
    }

    @Override
    public double fly() {
        return 2;
    }


    @Override
    public double swim() {
        return 2;
    }
}
