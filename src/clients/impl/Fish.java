package clients.impl;
import clients.Animal;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;
public class Fish extends Animal implements Swimable {
    public Fish(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Рыба хавает");
    }


    @Override
    public double swim() {
        return 5;
    }
}
