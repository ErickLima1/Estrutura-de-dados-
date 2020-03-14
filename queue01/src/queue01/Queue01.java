
package queue01;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
  public static void main(String[] args) {
   Queue<String> FilaEspera = new LinkedList<>();
   //Adicionar Elementos na Fila.
   FilaEspera.add("orochi");
   FilaEspera.add("Erick");
   FilaEspera.add("Miranda");
   FilaEspera.add("Leticia");
   //Consulta A Fila.
      System.out.println("Elementos da Fila: " + FilaEspera);
   //Verificar Se a Fila Esta vazia.
      System.out.println("A Fila Esta vazia: " +FilaEspera.isEmpty());
   //Verificar o tamanho da fila
      System.out.println("Tamanho da Fila: " + FilaEspera.size());
   //Verificar um Elemento Especifico na fila
    String nome = "orochi";
     if(FilaEspera.contains(nome)){
         System.out.println(nome + " Esta na fila");
     }else {
         System.out.println(nome + " Não Esta na fila");
     }
     //removendo um elemento da fila(Quem Esta no inicio da fila)
         System.out.println("nome: " +FilaEspera.peek());
     //Removendo Quem esta no inicio da fila
        System.out.println("Removendo da fila: " +FilaEspera.poll());
        //System.out.println("nova Configuração: " + FilaEspera);
        
  }
    
}
