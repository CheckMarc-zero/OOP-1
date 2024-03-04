package Personal;

import clients.Animal;
import clients.Flyable;
import clients.Goable;
import clients.Swimable;

import java.awt.*;
import java.util.ArrayList;


public class VeterinaryClinic {
    public String title;
    public String adress;
    public VeterinaryClinic(String title, String adress) {
        this.title = title;
        this.adress = adress;

    }


    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Nurse> nurses = new ArrayList<>();

    public ArrayList addDoctor (Doctor doctor){

        doctors.add(doctor);
        System.out.println(doctors);
        return doctors;

    }
    public ArrayList removeDoctor (Doctor doctor){

        doctors.remove(doctor);
        System.out.println(doctors);
        return doctors;

    }
    public ArrayList addNurse (Nurse nurse){

        nurses.add(nurse);
        System.out.println(nurses);
        return nurses;

    }
    public ArrayList removeNurse (Nurse nurse){

        nurses.remove(nurse);
        System.out.println(nurses);
        return nurses;

    }

    ArrayList<Animal> flyables = new ArrayList<>();
    ArrayList<Animal> goables = new ArrayList<>();
    ArrayList<Animal> swimables = new ArrayList<>();
    public ArrayList sortFlyables(ArrayList<Animal> animals){
        for (Animal fly:animals){
            if (fly instanceof Flyable){
                flyables.add(fly);
            }
        }
        System.out.println("Летающие пациенты: " + flyables);
        return flyables;
    }
    public ArrayList sortGoables(ArrayList<Animal> animals){
        for (Animal fly:animals){
            if (fly instanceof Goable){
                goables.add(fly);
            }
        }
        System.out.println("Бегающие пациенты: " + goables);
        return goables;
    }  public ArrayList sortSwimables(ArrayList<Animal> animals){
        for (Animal fly:animals){
            if (fly instanceof Swimable){
                swimables.add(fly);
            }
        }
        System.out.println("Плавающие пациенты: " + swimables);
        return swimables;
    }


}
