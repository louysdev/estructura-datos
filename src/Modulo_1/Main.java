package Modulo_1;

public class Main {
    public static void main(String[] args) {
        //006
        String x = "Saludo bueno dia";
        System.out.println(x.charAt(x.length()-1));

        int largo = x.length();
        for(int i=0;i<16;i++){
            if(i<=9){
                System.out.print(i);
            }else{
                int z = i-10;
                System.out.print(z);
            }
        }

        System.out.println();
        for(int i=0;i<x.length();i++){
            System.out.print(x.charAt(i));
        }

        int c = x.indexOf("a");
        System.out.println("\n"+c);

    }
}
