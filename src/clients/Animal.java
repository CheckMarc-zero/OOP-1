package clients;

import java.time.LocalDate;
import java.util.Objects;

public class Animal {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }

    public Animal(){this("Жывотное",300,LocalDate.now(),new Owner());
    }

    public void sleep(){
        System.out.println(getType()+" sleep");
    }
    public void getUp(){
        System.out.println(getType()+" getUp");
    }
    public void eat(){
        System.out.println(getType()+" eat");
    }
    public void play(){
        System.out.println(getType()+" play");
    }
    public void toGo() {
        if (Objects.equals(getType(), "Fish") ) {
            System.out.println(getType() + " not go");
        } else {
            System.out.println(getType() + " go");
        }
    }
    public void fly(){
        if (Objects.equals( getType(), "Vorona") || Objects.equals(getType(), "Diatel")) {
            System.out.println(getType()+" fly");
        }
        else {
            System.out.println(getType()+" not fly");
        }

    }
    public void swim() {
        if (Objects.equals(getType(), "Fish") || Objects.equals(getType(), "Penguin")) {
            System.out.println(getType() + " swim");
        } else {
            System.out.println(getType() + " not swim")
            ;
        }
    }
    public String getType(){
        return getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public LocalDate getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("name= %s, weight= %s, age= %s, owner= %s",name,weight,age,owner);
    }
}
