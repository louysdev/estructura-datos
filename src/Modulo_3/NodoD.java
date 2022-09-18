package Modulo_3;

public class NodoD {
    int dato;
    NodoD adelante;
    NodoD atras;

    public NodoD(int dato){
        this.dato = dato;
        adelante = atras = null;
    }

    public int getDato(){
        return dato;
    }
}
