
package estruturaarvore;

import static estruturaarvore.noArvore.ordem;
import static estruturaarvore.noArvore.posOrdem;
import static estruturaarvore.noArvore.preOrdem;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class EstruturaArvore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        noArvore raiz = null;
        int op;
        
        do{
            System.out.println("\nMENU DE OPCOES\n");
            
            System.out.println("1- Inserir Elemento");
            System.out.println("2- Consulta de elemento");
            System.out.println("3- Consulta pre-ordem");
            System.out.println("4- Consulta pós-ordem");
            System.out.println("5- Consulta ordem");
            System.out.println("6- Remover um Elemento");
            System.out.println("7- Esvaziar Arvore");
            System.out.printf("Digite uma opção: ");
            
            op = sc.nextInt();
            
         //Inserir um elemento na arvore
            if(op == 1) {
                int valor;
                
                System.out.print("Digite um valor para inserir na arvore: ");
                  valor = sc.nextInt();
                  
                  noArvore noNovo = new noArvore(valor, null, null);
                  
                  if(raiz == null) {
                      
                      raiz = noNovo;
                  }else{
                      
                      noArvore aux = raiz;
                      boolean encontra = false;
                      
                      while(!encontra) {
                          
                          if(noNovo.valor < aux.valor) {
                              
                              if(aux.esquerda == null) {
                                  aux.esquerda = noNovo;
                                  encontra = true;
                              }else{
                                  aux = aux.esquerda;
                              }
                          }else{
                              
                            if(aux.direita == null) {
                                aux.direita = noNovo;
                                encontra = true;
                                
                            }else{
                                aux = aux.direita;
                            }
                          }
                        }
                      }
                    }
            if(op == 2) { //Consultando um no na arvore
                int valor;
                
                System.out.println("Digite o valor");
                valor = sc.nextInt();
                
                noArvore aux = raiz;
                boolean encontra = false;
                
                while(aux != null && encontra == false) {
                    if(valor == aux.valor) {
                        encontra = true;
                        
                    }else if(valor < aux.valor) {
                        aux = aux.esquerda;
                        
                    }else{
                        aux = aux.direita;
                    }
                    
                    if(encontra) {
                        System.out.println("-----------------------");
                        System.out.println("O Elemento Encontrado Foi: " + valor);
                        System.out.println("-----------------------");
                    }else{
                        
                        
                        System.out.println("Elemento não encontrado");
                    }
                }
            }
            if(op == 3) {//Consultando pre-Ordem da arvore
                preOrdem(raiz);
            }
            if(op == 4) {//Consultando pos-ordem da arovere
                posOrdem(raiz);
            }
            if(op == 5) {//Consultando arvore em ordem
                ordem(raiz);
            }
           if(op == 6) {//Excluindo um no da arvore
               int valor;
               System.out.println("Diite o valor");
               valor = sc.nextInt();
               
               noArvore aux = raiz;
               boolean encontra = false;
               
               if(valor != raiz.valor) {
                   noArvore antes = raiz;
                   aux = raiz;
               while(aux != null && encontra == false) {
                   if(valor == aux.valor) {
                       encontra = true;
                   }else if (valor < aux.valor) {
                       antes = aux;
                       aux = aux.esquerda;
                   }else{
                       antes = aux;
                       aux = aux.direita;
                   }
               }
               if(aux.esquerda == null && aux.direita == null) {
                   if(antes.esquerda == aux) {
                       antes.esquerda = null;
                   }else{
                       antes.direita = null;
                   }
               }else if (aux.esquerda != null && aux.direita == null) {
                   if(antes.esquerda == aux) {
                       antes.esquerda = aux.esquerda;
                   }else{
                       antes.direita = aux.esquerda;
                   }
               }else if (aux.esquerda == null && aux.direita != null) {
                   if(antes.esquerda == aux) {
                       antes.esquerda = aux.direita;
                   }else{
                       antes.esquerda = aux.direita;
                   }
               }else{
                   noArvore aux1 = aux.direita;
                   noArvore aux2 = aux.esquerda;
                   noArvore antesAtual = null;
                   
               if(aux == antes.direita) {
                   aux = aux.esquerda;
                   
                   while(aux.direita != null) {
                       antesAtual = aux;
                       aux = aux.direita;
                   }
                   antes.direita = aux;
               }else if (aux == antes.esquerda) {
                   aux = aux.esquerda;
                   
                   while(aux.direita != null) {
                       antesAtual = aux;
                       aux = aux.direita;
                   }
                   antes.esquerda = aux;
               }
               aux.direita = aux1;
               aux.esquerda = aux2;
               antesAtual.direita = null;
               
            }
           }else{
                   if(aux.direita == null && aux.esquerda == null) {
                       raiz = null;
                   }else{
                       if(aux.esquerda != null && aux.direita == null) 
                           raiz = aux.esquerda;
                       
                       else if(aux.esquerda == null && aux.direita == null)
                           raiz = aux.direita;
                       
                       else if(aux.esquerda != null && aux.direita != null) {
                           noArvore aux1 = raiz.esquerda;
                           noArvore aux2 = raiz.direita;
                           noArvore antesAtual = null;
                           
                           aux = raiz.esquerda;
                           
                           while(aux.direita != null) {
                               antesAtual = aux;
                               aux = aux.direita;
                           }
                           raiz = aux;
                           
                           aux.direita = aux1;
                           aux.esquerda = aux2;
                           antesAtual = null;
                       }
                   }
               }
         }
         if(op == 7) {
             if(raiz == null) {//Se a arvore Estiver vazia.
                 System.out.println("Arvore Vazia");
             }else{//Para Esvaziar a arvore.
                 raiz = null;
                 System.out.println("Arvore Esvaziada");
             }
         }
        }while(op != 8);
        
    }
    
}