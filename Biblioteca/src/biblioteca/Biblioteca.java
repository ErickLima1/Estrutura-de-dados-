
package biblioteca;

import java.util.Scanner;

public class Biblioteca {
    private static class STACK{
     String usuario;
     String titulodolivro;
     String  autor;
     int ano;
     public STACK prox;
    }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      STACK topo = null;
      STACK  aux;
      int op;
      do{
          System.out.println("-----Biblioteca-----");
          System.out.println("1- Devolve Livro ");
          System.out.println("2- Consultar livros ");
          System.out.println("3- Remover livros ");
          System.out.println("4- Sair ");
          System.out.print("Escolha uma opção: ");
          op = sc.nextInt();
          if(op< 1|| op > 4) System.out.println("opção invalida");
            if(op == 1) {
              STACK novo = new STACK() ;
              
            System.out.print("Digite o nome: ");
            	novo.usuario = sc.next();
            	
            	System.out.print("Digite o título do livro: ");
            	novo.titulodolivro = sc.next();
            	
            	System.out.print("Digite o autor: ");
            	novo.autor = sc.next();
            	
            	System.out.print("Digite o ano do livro: ");
            	novo.ano =  sc.nextInt();
               
            novo.prox = topo;    
            topo = novo;
            }
        if(op == 2) {
            if(topo == null) System.out.println("Registro Esta vazio.");
            else {
                aux = topo;
                while(aux != null) {
                System.out.println("Usuario: " + aux.usuario);
                System.out.println("Titulo do livro: " + aux.titulodolivro);
                System.out.println("Nome do Autor " + aux.autor);
                System.out.println("O Ano Do Livro: " + aux.ano);
                    System.out.println("");
                
                aux = aux.prox;
                }
            }
        }
        if(op == 3) {
            if(topo == null) System.out.println("Registro vazio");
            else {
               System.out.println("Usuario: " + topo.usuario);
               System.out.println("Titulo do livro: " + topo.titulodolivro);
               System.out.println("Nome do Autor " + topo.autor);
               System.out.println("O Ano Do Livro: " + topo.ano);         
               
               topo = topo.prox;
            } 
        }
      }while(op != 4);
      
  }
    
}
