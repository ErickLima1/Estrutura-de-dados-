package estrutura_de_dados01;

import java.util.ArrayList;
import java.util.List;


public class Estrutura_de_dados01 {
  public static void main(String[] args) {
  //CRIAR O ARRAYLIST
  List<String> al = new ArrayList();
  //Adicionar Elementos No ArrayList
  System.out.println(al.add("erick"));
  al.add("CLEITOM");
  al.add("PEDRO");
   //Exibir elemento no ArrayList usando get
      System.out.println("Usando o Get = " + al.get(2));
 }
    
}
