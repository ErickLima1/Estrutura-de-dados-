package arvorebinario;

 //*@author Erick
public class ArvoreBinario {
    int valor;
    ArvoreBinario noEsqueda, noDireita;
    int maisAlto;
    
    public ArvoreBinario(int valor) {
        this.valor = valor;
    }
    public static ArvoreBinario Raiz;
    
    public static void inserir(int valor) {
        inserir(Raiz, valor);
    }
    
    public static void inserir(ArvoreBinario node,int valor) {
        if(node == null) {
            System.out.println("Raiz " + valor);
            Raiz = new ArvoreBinario (valor);
        }else{
            if(valor < node.valor) {
                if(node.noEsqueda != null) {
                   inserir(node.noEsqueda, valor);
                }else {
                    System.out.println("Inserindo " + valor);
                    node.noEsqueda = new ArvoreBinario(valor);
                }
            }else {
                if(node.noDireita != null) {
                    inserir(node.noDireita, valor);
                }else{
                    System.out.println("Inserindo " + valor);
                    node.noDireita = new ArvoreBinario(valor);
                }
            }
        }
    }
    public static void posordem(ArvoreBinario node) {
        if(node != null) {
            posordem(node.noEsqueda);
            posordem(node.noDireita);
            System.out.println(node.valor + " , ");
        }
        
    }
    public static void main(String[] args) {
        inserir(15);
        inserir(8);
        inserir(2);
        inserir(12);
        inserir(23);
        inserir(20);
        inserir(30);
    }
    }
    
