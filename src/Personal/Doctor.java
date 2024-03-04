package Personal;

import clients.Owner;

import java.time.LocalDate;

public class Doctor {
    public String name;
    public String surname;
    public String speciality;

    public Doctor(String name, String surname, String speciality) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
    }

    public void diagnose(){
        System.out.println("");
    }
    public void therapy(){
        System.out.println("");
    }

    @Override
    public String toString() {
        return String.format("name= %s, surname= %s, speciality= %s",name,surname,speciality);
    }


}
