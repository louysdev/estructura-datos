package Modulo_2;

import java.util.Vector;

public class Main2 {
    public static void main(String[] args) {

        Vector vector = new Vector(20);
        vector.add("p");
        vector.add("Hola");
        vector.insertElementAt(1,1);
        System.out.println(vector);
        vector.remove("Hola");
        System.out.println(vector.elementAt(0));


    }
}
