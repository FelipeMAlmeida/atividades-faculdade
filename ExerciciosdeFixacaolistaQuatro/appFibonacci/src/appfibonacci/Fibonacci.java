package appfibonacci;

/*
 A série de Fibonacci é formada pela seguinte sequência: 0,1,1,2,3,5,8,13,21,34,55...etc.

Escreva um aplicativo para gerar e mostrar a série de Fibonacci até a quantidade de termos informada pelo usuário do aplicativo.

 */
public class Fibonacci {

    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String sequenciaWhile() {
        String resposta = "";
        int valorUm = 0;
        int valorDois = 1;
        int i = 0;
        while (i < numero) {
            resposta = resposta + " " + valorUm + " ";
            valorDois += valorUm;
            valorUm = valorDois - valorUm;
            i++;
        }
        return resposta;

    }

    public String sequenciaDoWhile() {
        String resposta = "";
        int valorUm = 0;
        int valorDois = 1;
        int i = 0;
        do {
            resposta = resposta + " " + valorUm + " ";
            valorDois += valorUm;
            valorUm = valorDois - valorUm;
            i++;
        } while (i < numero);
        return resposta;

    }

    public String sequenciaFor() {
        String resposta = "";
        for (int valorUm = 0, valorDois = 1, i = 0; i < numero; valorDois += valorUm, valorUm = valorDois - valorUm, i++) {
            resposta = resposta + " " + valorUm + " ";
        }
        return resposta;

    }
}
