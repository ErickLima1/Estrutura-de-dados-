
package estrutura_de_dados02;

import java.util.Iterator;
import java.util.LinkedList;

public class Estrutura_de_dados02 {
  public static void main(String[] args) {
  LinkedList<String> al = new LinkedList();
 //Adicionar Elementos No Arraylist\\
  al.add("Erick");
  al.add("Lima");
  al.add("Oloco,bicho");
  al.add("Ivone");
  //Exibição do elementos arraylist usando metodo iterator
  Iterator<String> iterator = al.iterator();
  while(iterator.hasNext()) {
      System.out.println(iterator.next());
      
  }
  }
    
}
