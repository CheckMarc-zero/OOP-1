package Personal;

public class Nurse {
    public String name;
    public String surname;
    public String speciality;

    public Nurse(String name, String surname, String speciality) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
    }

    public void assist(){
        System.out.println("");
    }
    public void procedure(){
        System.out.println("");
    }
    @Override
    public String toString() {
        return String.format("name= %s, surname= %s, speciality= %s",name,surname,speciality);
    }

}
