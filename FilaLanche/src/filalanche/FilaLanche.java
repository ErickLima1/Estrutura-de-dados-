/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filalanche;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class FilaLanche {
    //Criando Estrutura do Prudutos
    public String especi;
    public String nome;
    public double preco;
    public FilaLanche prox;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Apontadores de inicio e fim da fila. Armazenam endereços de memoria
    FilaLanche inicio = null; 
    FilaLanche fim = null;
    Scanner sc = new Scanner(System.in);
    int op;
    
    do {
       System.out.println("--------Menu de Opção------------");
       System.out.println("1- Anota o Pedido Do Cliente");
       System.out.println("2- Processar a Pedido");
       System.out.println("3- Esvaziar a Fila");
       System.out.println("4- Sair");
       System.out.print("Digite a sua opção: ");
        op = Integer.parseInt(sc.nextLine());
     if(op < 1 || op > 4) System.err.println("Erro");   
     
     if(op == 1) {
      int pedido;
      FilaLanche novo = new FilaLanche();
      
       System.out.printf("Nome Do Cliente ");
       novo.nome = sc.nextLine();
       
         System.out.println("------Cardapio----------------------");
         System.out.println("1- Cachorro Quente " + "Preço:  6.00");
         System.out.println("2- Bauru Simples " + "Preço:    8.30");
         System.out.println("3- Bauru com ovo " + "Preço:    9.50");
         System.out.println("4- Hamburgue " + "Preço:        5.10");
         System.out.println("5-Cheesehamburguer " + "Preço: 5.10");
         System.out.print("Digite o seu pedido ");
         pedido = Integer.parseInt(sc.nextLine());
         
         switch(pedido) {
             case 1:
                novo.especi = "Cachorro Quente";
                novo.preco = 6.00;
                break;
             case 2:
                 novo.especi = "Bauru Simples";
                 novo.preco = 8.30;
                 break;
             case 3:
                 novo.especi = "Bauru com ovo";
                 novo.preco = 9.50;
                 break;
             case 4:
                 novo.especi = "Hamburgue";
                 novo.preco = 5.10;
                 break;
             case 5:
                 novo.especi = "Cheesehamburguer";
                 novo.preco = 5.10;
                 break;
             default:
                 System.err.println("Erro no Produto");
                 
         }
         novo.prox = null;
         
         if(inicio == null) {
             //Fila vazia e o numero Inserido Sera o primerio e o ultimo
             inicio = novo;
             fim = novo;
         }else{
             fim.prox = novo;
             fim = novo;
         }
         System.out.println("Pedido Processado com Sucesso!");
     }
     if(op == 2) {
         if(inicio == null) System.err.println("sem pedidos na conta");
         
         else{
          
          while(inicio != null) {
         System.out.println("------Cardapio Do Cliente: "+"Nome DO Cliente: " + inicio.nome+"-----");
         System.out.println("Pedido Do Cliente: " + inicio.especi);
         System.out.println("Preço Do cliente: " + inicio.preco + "R$");
         inicio = inicio.prox;
        }
         }
     }
     if(op == 3) {
         if(inicio == null) System.err.println("Fila vazia");
     else{
          inicio = null;
         System.out.println("Esvaziando a fila"); 
     }
     }
}while(op != 4);
    
}
}

