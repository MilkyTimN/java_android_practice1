package hw11;

import java.util.ArrayList;
import java.util.Arrays;

public class Generics <E>{
    private E[] array;

    public Generics(E...array) {
        this.array = array;
    }

    public E[] getArray() {
        return array;
    }

    public void replaceElements(Integer a, Integer b){
        E temporary = this.array[a];
        this.array[a] = this.array[b];
        this.array[b] = temporary;
    }

    public ArrayList<E> toArrayList(){
        ArrayList<E> arrayList = new ArrayList<>();
        for (E element : this.array) {
            arrayList.add(element);
        }
        return arrayList;
    }

    @Override
    public String toString() {
        return "Generics{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

}
