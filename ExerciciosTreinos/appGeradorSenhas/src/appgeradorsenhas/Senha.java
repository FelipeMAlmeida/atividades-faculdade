package appgeradorsenhas;

import java.lang.Math;

public class Senha {

    private int qntNumeros;

    public Senha(int qntNumeros) {
        this.qntNumeros = qntNumeros;
    }

    public String aleatorioNumeros() {
        int valorUm = 0;
        String resposta = "";
        int i = 0;
        while (i < qntNumeros) {
            valorUm = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
            resposta = resposta + " " + valorUm + " ";
            i++;
        }
        return resposta;

    }

    public String aleatorioNumerosLetras() {
        String valorUm[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String resposta = "";
        int i = 0;
        int delimitacao;
        while (i < qntNumeros) {
            delimitacao = (int) Math.floor(Math.random() * (63 - 1 + 1) + 1);
            String valor = valorUm[delimitacao];
            resposta = resposta + " " + valor + " ";
            i++;
        }
        return resposta;
    }

    public String aleatorioNumerosLetrasSimbolos() {
        String valorUm[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "!", "\\", "'", "!", "#", "$", "%", "&", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=",
            ">", "?", "@", "[", "]", "^", "_", "`", "{", "|", "}", "~", "\""};
        String resposta = "";
        int i = 0;
        int delimitacao;
        while (i < qntNumeros) {
            delimitacao = (int) Math.floor(Math.random() * (95 - 1 + 1) + 1);
            String valor = valorUm[delimitacao];
            resposta = resposta + " " + valor + " ";
            i++;
        }
        return resposta;
    }
}
