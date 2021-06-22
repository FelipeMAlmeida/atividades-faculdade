package appProva;

public class Atleta extends Pessoa {

    private String categoria;

    public Atleta(String categoria, String nome, int idade, String sexo, float peso, float altura) {
        super(nome, idade, sexo, peso, altura);
        this.categoria = categoria;
        categoriaOficial();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void categoriaOficial() {
        if (idade < 15) {
            categoria = "INFANTIL";
        } else if (idade >= 15 && idade < 18) {
            categoria = "JUVENIL";
        } else if (idade >= 18 && idade < 60) {
            categoria = "ADULTO";
        } else {
            categoria = "SENIOR";
        }
    }

    public float pesoIdeal() {
        float pesoIdeal;
        if (sexo.equals("MASCULINO")) {
            pesoIdeal = peso * altura - 58;
        } else {
            pesoIdeal = (float) (peso * altura - 44.7);
        }
        return pesoIdeal;
    }

    public String dados() {
        return "Informações do ATLETA"
                + "\nNome: " + nome
                + "\nIdade: " + idade
                + "\nSexo: " + sexo
                + "\nPeso: " + peso
                + "\nAltura: " + altura
                + "\nCategoria: " + categoria;

    }
}
