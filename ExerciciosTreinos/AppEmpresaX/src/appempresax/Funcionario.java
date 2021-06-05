package appempresax;

public class Funcionario {

    //Atributos
    private String nome;
    private int idade;
    private Cargo cargo; //os dados são coletados da classe Cargo pelo construtor
    private String RG;
    private String areaAtuacao;

    //Construtor da classe Funcionario
    public Funcionario(String nome, int idade, Cargo cargo, String RG, String areaAtuacao) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.RG = RG;
        this.areaAtuacao = areaAtuacao;

    }

    //Método que exibe os dados
    public String dados() {
        return "Nome: " + nome
                + "\nIdade: " + idade
                + "\nCargo: " + cargo.getCargo() //dados recolhidos do construtor da classe Cargo
                + "\nRG: " + RG
                + "\nÁrea de atuação: " + areaAtuacao
                + "\nSalário: " + cargo.getSalario(); //dados recolhidos do construtor da classe Cargo

    }
}
