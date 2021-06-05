package apptabuada;

public class Tabuada {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String tabuadaWhile() {
        String Resposta = "";
        int i = 1;
        while (i <= 10) {
            Resposta = Resposta + numero + "X" + i + " = " + numero * i + "\n";
            i++;
        }
        return Resposta;

    }

    public String tabuadaDoWhile() {
        String Resposta = "";
        int i = 1;
        do {
            Resposta = Resposta + numero + "X" + i + " = " + numero * i + "\n";
            i++;
        } while (i <= 10);
        return Resposta;
    }

    public String tabuadaFor() {
        String Resposta = "";
        for (int i = 1; i <= 10; i++) {
            Resposta = Resposta + numero + "X" + i + " = " + numero * i + "\n";
        }
        return Resposta;
    }
}
