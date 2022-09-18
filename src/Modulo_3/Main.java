package Modulo_3;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaDobleCircular listaEnlazadaDobleCircular = new ListaEnlazadaDobleCircular();
        listaEnlazadaDobleCircular.agregar(1);
        listaEnlazadaDobleCircular.agregar(2);
        listaEnlazadaDobleCircular.agregar(3);
        listaEnlazadaDobleCircular.eliminar(2);
        listaEnlazadaDobleCircular.ver();
    }
}
