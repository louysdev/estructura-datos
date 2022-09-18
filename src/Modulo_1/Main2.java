package Modulo_1;

public class Main2 {
    public static void main(String[] args) {
        //007
        String x1 = "Hola";
        String x2 = x1;
        System.out.println(x1.hashCode());
        System.out.println(x2.hashCode());
        x1 = "Hello";
        System.out.println(x1.hashCode());
        System.out.println(x2.hashCode());
    }
}
