package Modulo_4;

public class Pila {
    private  NodoPila ultimo;
    int tamaño;

    public Pila(){
        ultimo = null;
        tamaño = 0;
    }

    public boolean empty(){
        return ultimo == null;
    }

    public void push(int dato){
        NodoPila nuevo = new NodoPila(dato);
        nuevo.siguiente = ultimo;
        ultimo = nuevo;
        tamaño++;
    }

    public int pop(){
        int tmp = ultimo.dato;
        ultimo = ultimo.siguiente;
        tamaño--;
        return tmp;
    }

    public int peek(){
        return ultimo.dato;
    }

    public int size(){
        return tamaño;
    }

    public void clear(){
        while(!empty()){
            pop();
        }
    }

    public void see(){
        while (ultimo != null){
            System.out.println(pop());
        }
    }
}
