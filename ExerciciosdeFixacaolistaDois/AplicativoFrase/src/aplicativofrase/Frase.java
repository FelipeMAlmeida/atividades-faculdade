package aplicativofrase;
//Elabore um aplicativo que receba uma frase. Exiba a frase informada em caixa alta.
public class Frase {
    private String frase;

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    public String fraseConvertida(){
        String fraseConvertida = frase.toUpperCase();
        return fraseConvertida;
    }
}
