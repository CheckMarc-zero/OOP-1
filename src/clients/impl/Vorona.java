package clients.impl;
import clients.Animal;
import clients.Flyable;
import clients.Owner;

import java.time.LocalDate;
public class Vorona extends Animal implements Flyable {
    public Vorona(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Вороона клюёт");
    }

    @Override
    public double fly() {
        return 3;
    }
}
