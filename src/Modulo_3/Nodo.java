package Modulo_3;

public class Nodo {
    int dato;
    Nodo referencia;

    //Set y Get de dato
    public Nodo(int dato){
        this.dato = dato;
        this.referencia = null;
    }

    public int getDato(){
        return dato;
    }

    // Set y Get de referencia
    public void setRef(Nodo ref){
        this.referencia = ref;
    }

    public Nodo getRef(){
        return referencia;
    }

}
