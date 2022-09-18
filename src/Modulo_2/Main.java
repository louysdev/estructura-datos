package Modulo_2;

public class Main {
    public static void main(String[] args) {

        int arreglo[][]= {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        int a[][] = new int[3][3];
        int n;

        for(int i=0; i<3;i++){
            for(int j=0; j<3; j++) {
                n = (int) (Math.random()*100);
                a[i][j] = n;
            }
        }

        for(int i=0; i<3;i++){
            for(int j=0; j<3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0; i<3;i++){
            for(int j=0; j<3; j++) {
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println();
        }

    }
}
