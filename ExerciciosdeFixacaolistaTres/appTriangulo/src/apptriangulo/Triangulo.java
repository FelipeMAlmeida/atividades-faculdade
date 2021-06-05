package apptriangulo;

/*
Implemente uma classe Triangulo. Os atributos da classe são os lados do triângulo (float). Implemente métodos de
acesso set e get e os seguintes métodos gerais: boolean ehTriangulo() para verificar se os lados formam triângulo
(para formar um triângulo qualquer lado deverá ser inferior a soma dos outros dois); String tipoTriangulo() para
retornar um dos tipos: Equilátero (todos os lados iguais), Isósceles (somente dois lados iguais) ou Escaleno( todos
os lados são diferentes); float perimetroTriangulo() para calcular e retornar a soma de todos os lados do triângulo. 
 */
public class Triangulo {

    private float ladoUm;
    private float ladoDois;
    private float ladoTres;

    public float getLadoUm() {
        return ladoUm;
    }

    public void setLadoUm(float ladoUm) {
        this.ladoUm = ladoUm;
    }

    public float getLadoDois() {
        return ladoDois;
    }

    public void setLadoDois(float ladoDois) {
        this.ladoDois = ladoDois;
    }

    public float getLadoTres() {
        return ladoTres;
    }

    public void setLadoTres(float ladoTres) {
        this.ladoTres = ladoTres;
    }

    public boolean ehTriangulo() {
        if ((ladoUm < ladoDois + ladoTres && ladoDois < ladoUm + ladoTres && ladoTres < ladoUm + ladoDois)) {

            return true;

        } else {
            return false;

        }

    }

    public String tipoTriangulo() {
        String resultado = "";
        if (!ehTriangulo()) {
            resultado = "Não é um triângulo";
        } else {
            if (ladoUm == ladoDois && ladoDois == ladoTres) {
                resultado = "É um triângulo Equilátero";
            } else if (ladoUm == ladoDois || ladoUm == ladoTres || ladoDois == ladoTres) {
                resultado = "É um triângulo Isósceles";
            } else {
                resultado = "É um triângulo Escaleno";
            }
        }
        return resultado;
    }
}
