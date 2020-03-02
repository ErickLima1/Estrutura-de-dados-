
package dequeed;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;


public class DequeED {

    public static void main(String[] args) {
   Deque<String> deque = new LinkedList();
    //Adicionar Elemntos
      deque.add("Elemento 1 (calda)" );
      deque.addFirst("Elemento 2 (cabeça)");
      deque.addLast("Elemento 3 (calda)");
    //Adicionar Elementos com retorno de validação (booleano)
      deque.offer("Elemento 5 (calda)");
      deque.offerFirst("Elementos 6 (Cabeça)");
      deque.offerLast("Elemento 7 (calda)");
    //Exibir todo o Deque
        System.out.println(deque);
    //Interar no deque e exibir elemento por elemento
    //Padrao (inio - fim)
    Iterator iterator = deque.iterator();
    while(iterator.hasNext()) 
        System.out.println("\t " + iterator.next());
    //Reserva(Fim - inicio)
     Iterator reverso = deque.descendingIterator();
     while(reverso.hasNext()) 
         System.out.println("\t " + reverso.next());
     
    //Removendo Da cabeça do deque
        System.out.println("\t " + deque.pop());
        System.out.println("Apos o Pop " + deque); 
    //Removendo a calda
        deque.removeLast();
        System.out.println("Apos A remoção do ultimo deque " + deque);
   
 }
    
}
