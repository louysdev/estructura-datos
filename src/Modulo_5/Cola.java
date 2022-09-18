package Modulo_5;

public class Cola {
    int tamaño;
    NodoCola primero, ultimo;

    public Cola(){
        tamaño = 0;
        primero = ultimo = null;
    }

    public boolean empty(){
        return primero == null;
    }

    public void insert(int dato){
        NodoCola nuevo = new NodoCola(dato);
        if(empty()){
            primero = nuevo;
        }else{
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        tamaño++;
    }

    public int delete(){
        int tmp = primero.dato;
        primero = primero.siguiente;
        tamaño--;
        return tmp;
    }

    public int size(){
        return tamaño;
    }

    public int inicio(){
        return primero.dato;
    }

    public void see(){
        while (!empty()){
            System.out.println(delete());
        }
    }

}
