import Personal.Doctor;
import Personal.Nurse;
import Personal.VeterinaryClinic;
import clients.*;
import clients.impl.*;
import pharmacy.Medicine;
import pharmacy.MedicineComponent;
import pharmacy.impl.Asitromicine;
import pharmacy.impl.Penicilin;
import pharmacy.impl.Vetbicid;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


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
      // clinic1.addDoctor(hirurg);
       //clinic1.addDoctor(therapist);
      // clinic1.removeDoctor(hirurg);
       //clinic1.addNurse(uchastok);
     //  clinic1.addNurse(operation);
     //  clinic1.removeNurse(operation);
      // clinic1.sortFlyables(animals);
      // clinic1.sortGoables(animals);
       //clinic1.sortSwimables(animals);
        ArrayList<MedicineComponent> medList = new ArrayList<>();

        Asitromicine asitromicine1 = new Asitromicine("Asitromicine",50,70);
        Penicilin penicilin1 = new Penicilin("Penicilin",30,50);
        Vetbicid vetbicid1 = new Vetbicid("Vetbicid",40,30);
        Medicine medicine1 = new Medicine();
        medicine1.addComponent(asitromicine1).addComponent(penicilin1).addComponent(vetbicid1);

        Asitromicine asitromicine2 = new Asitromicine("Asitromicine",40,70);
        Penicilin penicilin2 = new Penicilin("Penicilin",20,50);
        Vetbicid vetbicid2 = new Vetbicid("Vetbicid",30,30);
        Medicine medicine2 = new Medicine();
        medicine2.addComponent(asitromicine2).addComponent(penicilin2).addComponent(vetbicid2);

        Asitromicine asitromicine3 = new Asitromicine("Asitromicine",25,70);
        Penicilin penicilin3 = new Penicilin("Penicilin",15,50);
        Vetbicid vetbicid3 = new Vetbicid("Vetbicid",20,30);
        Medicine medicine3 = new Medicine();
        medicine3.addComponent(asitromicine3).addComponent(penicilin3).addComponent(vetbicid3);

        Iterator<MedicineComponent> med = medicine1;
       // while (med.hasNext()) System.out.println(med.next());

        medList.add(asitromicine1);
        medList.add(penicilin1);
        medList.add(vetbicid1);
        //System.out.println(medList);
        Collections.sort(medList);
        //System.out.println(medList);

        ArrayList<Medicine> medicineList = new ArrayList<>();
        medicineList.add(medicine2);
        medicineList.add(medicine1);
        medicineList.add(medicine3);
        System.out.println(medicineList);
        Collections.sort(medicineList);
        System.out.println(medicineList);









    }
}