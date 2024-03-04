import Personal.Doctor;
import Personal.Nurse;
import Personal.VeterinaryClinic;
import clients.*;
import clients.impl.*;

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
        Duck duck1 = new Duck("Дуся",4,LocalDate.now(),new Owner());
        //System.out.println(leva);
        //System.out.println(leva.getType());


        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(leva);
        animals.add(sobak);
        animals.add(vorona1);
        animals.add(diatel1);
        animals.add(lesh);
        animals.add(penguin1);
        animals.add(duck1);
        //System.out.println(animals);
        Doctor hirurg = new Doctor("Vasiliy","Ishenko","hirurg");
        Doctor therapist = new Doctor("Ivan","Frolov","Therapist");
        Nurse uchastok = new Nurse("Olga","Shalina","uchastok");
        Nurse operation = new Nurse("Nina","Grebeshkova","operation");
       VeterinaryClinic clinic1 = new VeterinaryClinic("New","Gorbacheva,5");
       clinic1.addDoctor(hirurg);
       clinic1.addDoctor(therapist);
       clinic1.removeDoctor(hirurg);
       clinic1.addNurse(uchastok);
       clinic1.addNurse(operation);
       clinic1.removeNurse(operation);
       clinic1.sortFlyables(animals);
       clinic1.sortGoables(animals);
       clinic1.sortSwimables(animals);



    }
}