package Modulo_7;

import java.util.Hashtable;

public class HTable {
    public static void main(String[] args) {

        Hashtable<String, String> tabla = new Hashtable<String, String>();
        tabla.put("Angel", "Secretario");
        tabla.put("Martin", "Doctor");
        tabla.put("Angel", "Mecanico");

        System.out.println(tabla.get("Angel"));


    }
}
