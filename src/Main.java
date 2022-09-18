public class Main {
    public static void main(String[] args) {

        Creacion creacion = new Creacion("Pepe", "Juan");
        creacion.generar(5);

        while(!creacion.alamacen.isEmpty()){
            System.out.print("["+creacion.alamacen.pop()+"] ");
        }

    }
}
