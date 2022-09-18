package Modulo_3;

public class ListaEnlazadaDoble {
    NodoD primero, ultimo;
    int tamaño;

    public ListaEnlazadaDoble(){}

    public void agregar(int dato){
        NodoD nuevo = new NodoD(dato);
        if(tamaño == 0){
            primero = ultimo = nuevo;
        }else{
            nuevo.atras = ultimo;
            ultimo.adelante = nuevo;
            ultimo = nuevo;
        }
        tamaño++;
    }

    public void agregarInicio(int dato){
        NodoD nuevo = new NodoD(dato);
        if(tamaño == 0){
            primero = ultimo = nuevo;
        }else{
            nuevo.adelante = primero;
            primero.atras = nuevo;
            primero = nuevo;
        }
        tamaño++;
    }

    public boolean eliminar(){
        if(tamaño > 0){
            if(tamaño() > 1){
                primero = ultimo = null;
            }else{
                ultimo.atras.adelante = null;
                ultimo = ultimo.adelante = null;
            }
            tamaño--;
        }
        return false;
    }

    public boolean eliminarInicio(){
        if(tamaño > 0){
            if(tamaño() > 1){
                primero = ultimo = null;
            }else{
                primero.adelante.atras = null;
                primero = primero.adelante;
            }
            tamaño--;
        }
        return false;
    }

    public void verLista(){
        NodoD nodov;
        nodov = primero;
        while(nodov != null){
            System.out.println(nodov.dato);
            nodov = nodov.adelante;
        }
    }

    public int tamaño(){
        return tamaño;
    }

    public boolean vacio() {
        return tamaño() == 0;
    }
}
