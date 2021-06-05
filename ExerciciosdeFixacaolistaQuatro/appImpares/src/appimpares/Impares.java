/*
Escreva um aplicativo que calcula o produto dos inteiros ímpares de 1 ao 15 e então exiba o resultado
 */
package appimpares;

public class Impares {

    public int calcula() {
        int resposta=1;
        int numero = 1;
        while (numero < 16) {
            if(numero%2!=0){
                resposta *= numero; //*= singnifica que resposta é igual o numero anterior vezes o numero que está sendo atribuido
            }
            numero++;
        }
        return resposta;
    }
}
