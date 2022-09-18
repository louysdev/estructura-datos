package Modulo_8;

public class NodoArbol {
    int dato;
    NodoArbol hijoI, hijoD;

    public NodoArbol(int dato){
        this.dato = dato;
        hijoI = hijoD = null;
    }

    public String toString(){
        return "dato: "+dato;
    }

}
