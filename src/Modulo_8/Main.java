package Modulo_8;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);

        for(Iterator<Integer> i = treeSet.iterator();
        i.hasNext();){
            System.out.println(i.next());
        }

        /*ArbolBinario arbolBinario = new ArbolBinario();
        arbolBinario.insertar(1);
        arbolBinario.insertar(2);
        arbolBinario.insertar(1);
        arbolBinario.insertar(10);
        arbolBinario.ver(arbolBinario.raiz);*/

    }

}
