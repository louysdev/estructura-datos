package Modulo_8;

import Modulo_3.Nodo;

public class ArbolBinario {
    NodoArbol raiz;

    public ArbolBinario(){
        raiz = null;
    }

    public void insertar(int dato){
        NodoArbol nuevo = new NodoArbol(dato);
        if(raiz == null){
            raiz = nuevo;
        }else{
            NodoArbol tmp = raiz, padre;

            while(true){
                padre = tmp;
                if(dato < tmp.dato){
                    tmp = tmp.hijoI;
                    if(tmp == null){
                        padre.hijoI = nuevo;
                        return;
                    }
                }else{
                    tmp = tmp.hijoD;
                    if(tmp == null){
                        padre.hijoD = nuevo;
                        return;
                    }
                }
            }
        }
    }

    public boolean vacio(){
        return raiz == null;
    }

    public void ver(NodoArbol nodo){
        if(nodo != null){
            ver(nodo.hijoI);
            System.out.println(nodo.dato);
            ver(nodo.hijoD);
        }
    }

}
