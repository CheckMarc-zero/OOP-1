package clients.impl;
import clients.Animal;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;
public class Penguin extends Animal implements Swimable {
    public Penguin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Пингвин рыбов ест");
    }


    @Override
    public double swim() {
        return 3;
    }
}
