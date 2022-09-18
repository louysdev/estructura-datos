package Modulo_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Datos {
    public static void main(String[] args) {

        //Cola:
        Queue<Integer> cola = new LinkedList<Integer>();
        cola.offer(1);
        cola.offer(2);
        cola.offer(3);

        while(!cola.isEmpty()){
            System.out.print("["+cola.poll()+"] ");
        }

        //Pila:
        Stack pila = new Stack();
        pila.push(1);
        pila.push(2);
        pila.push("Pepe");

        System.out.println("");
        while(!pila.empty()){
            System.out.print("["+pila.pop()+"] ");
        }

        //Lista enlazada:
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add("A");
        linkedList.add("MMG");

        System.out.println("");
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());


    }
}
