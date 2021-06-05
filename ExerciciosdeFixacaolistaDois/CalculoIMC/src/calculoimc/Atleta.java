package calculoimc;
/*Elabore um aplicativo que recebe a altura e o peso de um atleta. Calcule e exiba o índice de massa 
corpórea (IMC)*/
public class Atleta {
    private float altura;
    private float peso;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float calculoImc(){
        float calculoImc = peso / (altura * altura);
        return calculoImc;
    }
}
