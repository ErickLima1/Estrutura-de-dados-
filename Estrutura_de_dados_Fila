//Estrutura de daodos
package fila;

import java.util.Scanner;

public class FILA {
    public int num;
    public FILA prox;
  public static void main(String[] args) {
  // TODO Auto-generated method stub   
  Scanner entrada = new Scanner(System.in);
  //Apontadores de inicio e fim de fila. Armazenam endereços de memória
    FILA inicio = null;
    FILA fim = null;
    
    FILA aux = null;
    int op;
    do{
        System.out.println("-------Menu-----");
        System.out.println("1- Inserir fila ");
        System.out.println("2- Consultar toda Fila ");
        System.out.println("3- Remove Fila ");
        System.out.println("4- Esvaziar fila");
        System.out.println("5- Sair");
        System.out.printf("Digite a sua opção");
        op = entrada.nextInt();
        //validação de entrada
        if(op < 1 ||op > 5) System.out.println("Opção Invalida");
        if(op == 1) {
        //Criação e Inserção na Fila
            FILA novo = new FILA();
            novo.num = entrada.nextInt();
            novo.prox = null;
            if(inicio == null) {
        //Fila vazia e o elemento sera o primeiro e o ultimo
            inicio = novo;
            fim = novo;
            }else {
                fim.prox = novo;
                fim = novo;
            }
            System.out.println("Numero Inserido na fila");
        }
        if(op== 2) {
            //Consulta Fila
            if(inicio == null) System.out.println("Fila vazia");
            else {
                aux = inicio;
                while(aux != null) {
                    System.out.println(aux.num + " ");
                    aux = aux.prox;
                }
            }
        }
        if(op == 3) {
            if(inicio == null) System.out.println("Fila vazia");
            else {
           ///A Fila Contem elementos e o primeiro que foi Inserido sera removido
                System.out.println("Numero " + inicio.num + " Removido");
                inicio = inicio.prox;
            }
        }
        if(op == 4) {
            if(inicio == null) System.out.println("fila vazia");
            else{
                inicio = null;
                System.out.println("Fila vazia");
            }
        }
        
    }while(op != 5);
  }
    
}
