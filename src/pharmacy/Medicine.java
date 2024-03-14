package pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine implements Iterator,Comparable<Medicine> {
    public List<MedicineComponent> components;
    public  int index;

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }
    public Medicine addComponent(MedicineComponent component){
        components.add(component);
        return this;
    }

    @Override
    public boolean hasNext() {
        return index<components.size();
    }

    @Override
    public Object next() {
        return components.get(index++);
    }
    @Override
    public String toString(){
        return "Medicine: "+ components.toString();
    }


    @Override
    public int compareTo(Medicine o) {
       int medPower= 0;
       int medPowerO = 0;
       for(int i =0; i<components.size();i++){
           medPower = (int)(components.get(i).weight)*components.get(i).power+medPower;
       }
        for(int i =0; i<o.components.size();i++){
            medPowerO = (int)(o.components.get(i).weight)*o.components.get(i).power+medPowerO;
        }
        return medPower-medPowerO;
    }
}
