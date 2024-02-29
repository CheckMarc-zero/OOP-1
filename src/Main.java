import clients.*;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Lion leva = new Lion("Лёва",200,LocalDate.now(),new Owner());
        Dog sobak = new Dog("Блохастый",20,LocalDate.now(),new Owner());
        Vorona vorona1 = new Vorona("Анфиса",3,LocalDate.now(),new Owner());
        Diatel diatel1 = new Diatel("Перфоратор",2,LocalDate.now(),new Owner());
        Fish lesh = new Fish("Закуска",2,LocalDate.now(),new Owner());
        Penguin penguin1 = new Penguin("Пин",20,LocalDate.now(),new Owner());
        System.out.println(leva);
        System.out.println(leva.getType());


        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(leva);
        animals.add(sobak);
        animals.add(vorona1);
        animals.add(diatel1);
        animals.add(lesh);
        animals.add(penguin1);
        System.out.println(animals);
leva.fly();
vorona1.fly();
sobak.toGo();
lesh.toGo();
diatel1.swim();
penguin1.swim();

    }
}