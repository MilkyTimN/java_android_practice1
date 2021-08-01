package hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <E extends Fruit>{
   public List<E> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public Box(E... fruits) {
        this.box = new ArrayList(Arrays.asList(fruits));
    }

    public Float getWeight(){
        Float weight = 0.0f;
        for (E fruit: box) {
            weight = weight + fruit.getWeight();
        }
        return weight;
    }

    public Boolean compare(Box <?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.001;
    }

    public void replace(Box <E> another) {
        another.box.addAll(this.box);
        this.box.clear();
    }

    public void add(E fruit){
        box.add(fruit);
    }
}
