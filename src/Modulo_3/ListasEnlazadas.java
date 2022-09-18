package Modulo_3;

public class ListasEnlazadas {
    protected Nodo primero;

    public ListasEnlazadas(){
        primero = null;
    }

    public ListasEnlazadas agregarInicio(int dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.referencia = primero;
        primero = nuevo;
        return this;
    }

    public void agregarFinal(int dato){
        Nodo nuevof = new Nodo(dato);
        nuevof.referencia = null;

        if(primero==null){
            primero=nuevof;
            return;
        }
        Nodo tmp;
        for(tmp=primero;tmp.getRef()!=null;tmp=tmp.getRef());
        tmp.setRef(nuevof);
    }

    public Nodo buscar(int dato){
        Nodo nodob;
        for(nodob = primero; nodob != null; nodob = nodob.getRef()){
            if(dato == nodob.dato){
                return nodob;
            }
        }
        return null;
    }

    public void eliminar(int dato){
        boolean encontrado = false;
        Nodo actual, anterior;
        actual = primero;
        anterior = null;

        while(actual != null && !encontrado){
            encontrado = (actual.dato == dato);
            if(!encontrado){
                anterior = actual;
                actual = actual.getRef();
            }
        }

        if(actual != null){
            if(actual == primero){
                primero = actual.referencia;
            }else{
                anterior.setRef(actual.referencia);
            }
        }
    }

    public void verLista(){
        Nodo nodov = primero;
        while (nodov!=null){
            System.out.println(nodov.dato);
            nodov = nodov.referencia;
        }
    }

}
