package clients.impl;
import clients.Animal;
import clients.Flyable;
import clients.Owner;

import java.time.LocalDate;
public class Diatel extends Animal implements Flyable {
    public Diatel(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Дятел долбит");
    }

    @Override
    public double fly() {
        return 4;
    }
}
