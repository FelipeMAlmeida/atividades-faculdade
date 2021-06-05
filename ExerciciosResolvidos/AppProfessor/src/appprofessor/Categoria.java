package appprofessor;

public class Categoria {
//Atributos

    private String nome;
    private float valorHora;

//Construtor
    public Categoria(String nome, float valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }
//Métodos de acesso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public void reajustaValorHora(float percentual) {
        valorHora += valorHora * percentual / 100;
    }
}
