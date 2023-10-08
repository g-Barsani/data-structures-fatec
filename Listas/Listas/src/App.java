public class App
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ListaCaracteres lista1 = new ListaCaracteres(3);
		
		// lista1.remover();
		// lista1.adicionar('o');
        // lista1.adicionar('v');
		// lista1.adicionar('o');
        // lista1.adicionar('s');

        lista1.adicionar('o');
        lista1.adicionar('v');
		lista1.adicionar('o');

        lista1.imprimir();

        lista1.remover();
        lista1.remover();
        lista1.imprimir();
        lista1.remover();
        lista1.imprimir();
        lista1.remover();
        lista1.imprimir();
        lista1.adicionar('w');
        lista1.adicionar('o');
        lista1.adicionar('w');
        lista1.imprimir();

        lista1.procurar('w');
	}
}

class ListaCaracteres {
    // Atributos
    int nrItens;  // Número total de itens do Array
    int tamanho;  // Tamanho de itens que estão ocupando o Array
    char[] itens;  // Array de caracteres
    
    // Método construtor
    ListaCaracteres (int n) {
        nrItens = n;
        tamanho = 0;
        itens = new char[nrItens];
    }
    

    boolean cheia() {
        return tamanho == nrItens;
    }

    boolean vazia() {
        return tamanho == 0;
    }
    
    void adicionar(char n) {
        if (cheia()) {
            System.out.println("Lista cheia!");
            return;
        }
        itens[tamanho] = n;
        tamanho++;
    }


    void remover() {
        if (vazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        itens[tamanho - 1] = ' ';
        tamanho--;
    }

    void imprimir() {
        for (int item : itens) {
            char character = (char) item;
            System.out.print(character);
        }
        System.out.println();
    }

    void procurar(char c) {
        for (int i = 0; i < tamanho; i++) {
            if (itens[i] == c) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("Item não encontrado!");
        return;
    }
}