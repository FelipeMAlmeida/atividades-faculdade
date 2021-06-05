package appempresa;

public class Funcionario {

    private String nome;
    private String departamento;
    private String matricula;
    private float horaMes;
    private float salarioPorHora;
    private String situacao = "Contratado";
    
// Construtor da classe funcionário, ele está adicionando os valores das variaveis inseridas na classe principal nas variaveis que estão nessa classe
    public Funcionario(String nome, String departamento, String matricula, float horaMes, float salarioPorHora) { //a ordems das variaveis tem que ser a mesma usada na criação do objt na classe principal

        this.nome = nome; //this.variavel é o modo que se usa para indicar que o valor atribuido será para as variaveis dessa classe
        this.departamento = departamento;
        this.matricula = matricula;
        this.horaMes = horaMes;
        this.salarioPorHora = salarioPorHora;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getHoraMes() {
        return horaMes;
    }

    public void setHoraMes(float horaMes) {
        this.horaMes = horaMes;
    }

    public float getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(float salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    private double calSalarioMensal() {
        double salarioBruto = salarioPorHora * horaMes;
        return salarioBruto;
    }

    private double calculaInss() {
        double desconto = 0;
        if (calSalarioMensal() <= 1174.86) {
            desconto = calSalarioMensal() * 8 / 100;
        } else if (calSalarioMensal() >= 1174.87 && calSalarioMensal() <= 1958.10) {
            desconto = calSalarioMensal() * 9 / 100;
        } else if (calSalarioMensal() <= 1958.11 && calSalarioMensal() <= 3916.20) {
            desconto = calSalarioMensal() * 11 / 100;
        } else {
            desconto = calSalarioMensal() * 13 / 100;
        }
        return desconto;

    }

    private double calcularIr() {
        double aliquota;
        if (calSalarioMensal() <= 1566.61) {
            aliquota = 0;
        } else if (calSalarioMensal() >= 1566.62 && calSalarioMensal() <= 2347.85) {
            aliquota = calSalarioMensal() * 7.5 / 100;
        } else if (calSalarioMensal() >= 2347.86 && calSalarioMensal() <= 3130.51) {
            aliquota = calSalarioMensal() * 15 / 100;
        } else if (calSalarioMensal() >= 3130.52 && calSalarioMensal() <= 3911.63) {
            aliquota = calSalarioMensal() * 22.5 / 100;
        } else {
            aliquota = calSalarioMensal() * 27.5 / 100;
        }
        return aliquota;
    }

    public double calculaSalarioLiquido() {
        double salarioLiquido;
        salarioLiquido = calSalarioMensal() - calculaInss() - calcularIr();
        return salarioLiquido;
    }

    public void bonificaFuncionario(float percentualBonificacao) {
        salarioPorHora += salarioPorHora * (percentualBonificacao / 100);
    }

    public void encerraContrato(String confirmacao) {
        if (confirmacao.equals("0")) {
            situacao = "Demitido";
        } else {
            situacao = "Contratado";
        }
    }

    public String dados() {
        String dadosFunc = "Nome: " + nome + "\n" + "Departamento: " + departamento + "\n" + "Matrícula: " + matricula + "\n" + "Salário: " + calculaSalarioLiquido()
                + "\n" + "O funcionário está: " + situacao;
        return dadosFunc;
    }

}
