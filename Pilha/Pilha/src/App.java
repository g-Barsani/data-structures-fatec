public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pilha pilha1 = new Pilha(4);
        pilha1.empilhar(1);
        pilha1.empilhar(11);
        pilha1.empilhar(111);
        pilha1.empilhar(1111);

        pilha1.empilhar(404);

        pilha1.desempilhar();
        pilha1.desempilhar();
        pilha1.desempilhar();
        // pilha1.desempilhar();
        // pilha1.desempilhar();

    }
}

class Pilha {
    int dados[];
    int tamanho;
    int topo;

    Pilha(int n) {
        tamanho = n;
        dados = new int[tamanho];
        topo = -1;
    }

    boolean cheia() {
        return tamanho -1 == topo;
    }

    boolean vazia() {
        return topo == -1;
    }

    void empilhar(int n) {
        if (cheia()) {
            System.out.println("Lista cheia!");
            return;
        } 
        topo++;
        dados[topo] = n;
    }

    void desempilhar() {
        if (vazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        dados[topo] = 0;
        topo--;
    }
}
