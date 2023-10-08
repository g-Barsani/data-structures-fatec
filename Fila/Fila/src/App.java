public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Fila fila1 = new Fila(3);
        // fila1.adicionar(1);
        // fila1.adicionar(11);
        // fila1.adicionar(111);

        // fila1.remover();
        // fila1.remover();
        // fila1.remover();
        // fila1.remover();
        
        // fila1.adicionar(2);
        // fila1.adicionar(22);
        // fila1.adicionar(222);
        // fila1.adicionar(2222);

        Fila fila1 = new Fila(5);
        fila1.adicionar(45);
        fila1.adicionar(1);
        fila1.adicionar(10);
        fila1.adicionar(100);
        fila1.adicionar(1000);
        fila1.adicionar(999);


        fila1.remover();
        fila1.adicionar(999);
    }
}

class Fila {
    int tamanho, limite, inicio, fim;
    int itens[];    

    Fila(int n) {
        limite = n;
        tamanho = limite;
        itens = new int[limite];
        inicio = 0;
        fim = inicio;
    }

    boolean vazia() {
        return fim == inicio;
    }

    boolean cheia() {
        return tamanho == fim;
    }

    void adicionar(int n) {
        if (cheia()) {
            System.out.println("Fila cheia!");
            return;
        }
        itens[fim] = n;
        fim++;
    }

    void remover() {
       if (vazia()) {
        System.out.println("Fila vazia!");
        return;
       }
       for (int i = 0; i < tamanho -1; i++) {
            itens[i] = itens[i+1];
       }
       itens[fim-1] = 0;
       fim--;
    }
}