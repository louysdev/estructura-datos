package Modulo_3;

public class ListaEnlazadaOrdenada extends ListasEnlazadas{

    public ListaEnlazadaOrdenada(){
        super();
    }

    public ListaEnlazadaOrdenada insertarOrden(int dato){
        Nodo nuevo = new Nodo(dato);

        if(primero == null){
            primero = nuevo;
        } else if(dato < primero.getDato()){
            nuevo.setRef(primero);
            primero = nuevo;
        } else{
            Nodo anterior, primeroO;
            anterior = primeroO = primero;
            while((primeroO.getRef() != null) && dato > primeroO.getDato()){
                anterior = primeroO;
                primeroO = primeroO.getRef();
            }
            if(dato > primeroO.getDato()){
                anterior = primeroO;
            }
            nuevo.setRef(anterior.getRef());
            anterior.setRef(nuevo);
        }

        return this;
    }
}
