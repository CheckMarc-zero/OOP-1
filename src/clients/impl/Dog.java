package clients.impl;
import clients.Animal;
import clients.Goable;
import clients.Owner;

import java.time.LocalDate;
public class Dog extends Animal implements Goable {
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public double go() {
        return 12;
    }
}
