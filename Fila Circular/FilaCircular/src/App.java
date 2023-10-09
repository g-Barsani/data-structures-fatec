public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        FilaCircular fila1 = new FilaCircular(4);
        fila1.adicionar(1);
        fila1.adicionar(11);
        fila1.adicionar(111);

        fila1.remover();

        fila1.adicionar(9);
        fila1.adicionar(45);
        fila1.adicionar(81);

        fila1.remover();
        fila1.remover();
        fila1.remover();

        fila1.adicionar(81);
        fila1.remover();


    }
}

class FilaCircular {
    int dados[];
    int inicio, fim, tamanho, nrItens;

    FilaCircular(int n) {
        tamanho = 0;
        inicio = 0;
        fim = inicio;
        nrItens = n;
        dados = new int[nrItens];
    }

    boolean cheia() {
        return tamanho == nrItens;
    }

    boolean vazia() {
        return tamanho == 0;
    }

    void adicionar(int n) {
        if (cheia()) {
            System.out.println("Fila circular cheia!");
            return;
        }
        dados[fim] = n;
        if (fim == nrItens -1) {
            fim = 0;
        } else {
            fim++;
        }
        tamanho++;
    }

    void remover() {
        if (vazia()) {
            System.out.println("Fila circular vazia!");
            return;
        }
        dados[inicio] = 0;
        if (inicio == nrItens -1) {
            inicio = 0;
        } else {
            inicio++;
        }
        tamanho--;
    }
}