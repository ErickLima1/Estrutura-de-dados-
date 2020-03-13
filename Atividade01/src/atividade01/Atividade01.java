
package atividade01;

import java.util.Scanner;


public class Atividade01 {
   private static class STACK{
    private String nome;
    private String titulodolivro;
    private String autor;
    private int ano;

    public STACK prox;
    
}
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    STACK topo = null;
    STACK aux;
    int op;
    do{
        System.out.println("----Biblioteca-----");
        System.out.println("1- nome do usuario");
        System.out.println("2- Titulo do Livro");
        System.out.println("3- Nome do autor do livro");
        System.out.println("4- Ano do livro");
        System.out.println("5 - Exibir todos os Dados");
        System.out.println("6- Remove dados");
        System.out.println("7- Sair");
        op = entrada.nextInt();
        
        if(op < 1 || op > 6 ) System.out.println("Opção invalida");
        
        if(op == 1) {
          STACK novolivro = new STACK();
          System.out.println("Anote o nome do usuario");
          novolivro.nome =  entrada.next();   
          System.out.println("Titulo do Livro que o usuario tava usando");
          novolivro.titulodolivro = entrada.next();
          System.out.println("Nome do autor do livro ");
           novolivro.autor = entrada.next();
           System.out.println("Ano Do livro");
            novolivro.ano = entrada.nextInt();
            
         
         novolivro.prox = topo;
         topo = novolivro;
            
        }
        if(op == 5) {
            aux = topo;
           if(topo == null) System.out.println("Pilha vazia");
           else{
            System.out.println("Usuario " + aux.nome);
            System.out.println("Titulo do livro " + aux.titulodolivro);
            System.out.println("Nome do Autor do livro " + aux.autor);
            System.out.println("Ano do livro " + aux.ano);
           }
            
        }
        if(op == 6) {
          if(topo == null) System.out.println("Pilha vazia");
          else{
            System.out.println("Usuario " + topo.nome);
            System.out.println("Titulo do livro " + topo.titulodolivro);
            System.out.println("Nome do Autor do livro " + topo.autor);
            System.out.println("Ano do livro " + topo.ano);
            topo = topo.prox;
        }
        }
        
    }while(op != 7);
    
  
  }
  
    
}
