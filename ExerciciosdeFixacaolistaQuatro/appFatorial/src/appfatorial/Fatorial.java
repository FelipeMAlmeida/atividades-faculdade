package appfatorial;

public class Fatorial {

    //Atributos
    private int numero;

    //Métodos de acesso (set e get)
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Método geral
    public long fatorialWhile() {
        if (numero > 1) {
            int cont = numero;
            long fat = 1;
            while (cont > 1) {
                fat = fat * cont; //fat*=cont
                cont--;
            } //fim da estrutra while
            return fat;
        } else if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return -1;
        }
    }

    public long fatorialFor() {
        if (numero < 0) {
            return -1;
        } else if (numero == 0 || numero == 1) {
            return 1;
        } else {
            long fat = 1;
            for (int cont = numero; cont > 1; cont--) {
                fat *= cont;
            }
            return fat;
        }
    }

    public long fatorialDoWhile() {
        long fat;

        if (numero < 0) {
            fat = -1;
        } else if (numero == 0 || numero == 1) {
            fat = 1;
        } else {
            int cont = numero;
            fat = 1;
            do {
                fat = fat * cont;
                cont--;
            } while (cont > 1);
        }
        return fat;
    }
}
