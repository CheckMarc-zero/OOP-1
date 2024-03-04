package clients.impl;

import clients.Animal;
import clients.Goable;
import clients.Owner;

import java.time.LocalDate;

public class Lion extends Animal implements Goable {
    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Лев мясо жрёт");
    }

    @Override
    public double go() {
        return 10;
    }
}
