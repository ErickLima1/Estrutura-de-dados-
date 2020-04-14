/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaarvore;

/**
 *
 * @author Erick
 */
public class noArvore {
    protected int valor;
    protected noArvore esquerda;
    protected noArvore direita;
 
 
 public noArvore(int valor,noArvore esquerda,noArvore direita) {
     this.valor = valor;
     this.esquerda = esquerda;
     this.direita = direita;
 }
 public int getValor() {
     System.out.println(valor);
     return valor;
 }

 public static void preOrdem(noArvore raiz) {
     noArvore aux = raiz;
     aux.getValor();
     
     if(aux.esquerda != null) {
         preOrdem(aux.esquerda);
     }
     if(aux.direita != null) {
         preOrdem(aux.direita);
     }
 }
 public static void posOrdem(noArvore raiz) {
     noArvore aux = raiz;
     
     
     if(aux.esquerda != null) {
         posOrdem(aux.esquerda);
     }
     if(aux.direita != null) {
         posOrdem(aux.direita);
     }
     aux.getValor();
 }
 public static void ordem(noArvore raiz) {
     noArvore aux = raiz;
     
     if(aux.esquerda != null) {
         ordem(aux.esquerda);
     }
     
      aux.getValor();
      
     if(aux.direita != null) {
         ordem(aux.direita);
     }
 }
 
 
 
    public noArvore getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(noArvore esquerda) {
        this.esquerda = esquerda;
    }

    public noArvore getDireita() {
        return direita;
    }

    public void setDireita(noArvore direita) {
        this.direita = direita;
    }
 
}
