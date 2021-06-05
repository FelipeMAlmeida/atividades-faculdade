package appprofessor;

import java.text.DecimalFormat;

public class Professor {

    //Atributos
    private String matricula;
    private String nome;
    private boolean ativo;
    private int horasTrabMes;
    private Categoria categoria;

    //Sobrecarga de construtor
    public Professor(String matricula, String nome, Categoria categoria) {
        this.matricula = matricula;
        this.nome = nome;
        this.categoria = categoria;
        ativo = true;
        horasTrabMes = 200; //para professor de tempo integral
    }

    public Professor(String matricula, String nome, int horasTrabMes, Categoria categoria) {
        this.matricula = matricula;
        this.nome = nome;
        this.horasTrabMes = horasTrabMes;
        this.categoria = categoria;
        ativo = true;
    }

    //Get e Set
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabMes() {
        return horasTrabMes;
    }

    public void setHorasTrabMes(int horasTrabMes) {
        this.horasTrabMes = horasTrabMes;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isAtivo() {
        return ativo;
    }

    //Métodos
    public void encerraContrato() {
        ativo = false;
    }

    public double salarioBrutoMensal() {
        return horasTrabMes * categoria.getValorHora();
    }

    public double inss() {
        double salario = salarioBrutoMensal();

        if (salario <= 1174.86) {
            return salario * 8 / 100;
        } else if (salario <= 1958.10) {
            return salario * 0.09;
        } else if (salario <= 3916.20) {
            return salario * 11 / 100;
        } else {
            return 3916.20 * 11 / 100;
        }
    }

    public double impostoRenda() {
        double salario = salarioBrutoMensal();

        if (salario <= 1566.61) {
            return 0;
        } else if (salario <= 2347.85) {
            return salario * 7.5 / 100;
        } else if (salario <= 3130.51) {
            return salario * 15 / 100;
        } else if (salario <= 3911.63) {
            return salario * 22.5 / 100;
        } else {
            return salario * 27.5 / 100;
        }
    }

    public double salarioLiquido() {
        double salario = salarioBrutoMensal() - (impostoRenda() + inss());
        return salario;
    }

    public String dados() {
        DecimalFormat mascara = new DecimalFormat("#,##0.00");
        String dados;
        if (!ativo) {
            dados = "Professor inativo. Não pertence mais ao quadro da Faculdade";
        } else {
            dados = "Demonstrativo de Pagamento do professor: " + nome + " - matrícula " + matricula
                    + "\nTotal de Horas trabalhadas no mês: " + this.getHorasTrabMes()
                    + "\nCategoria: " + this.getCategoria().getNome()
                    + "\nValor da hora: R$" + mascara.format(this.getCategoria().getValorHora())
                    + "\nSalário bruto: R$" + mascara.format(this.salarioBrutoMensal())
                    + "\nDesconto INSS: R$" + mascara.format(this.inss())
                    + "\nDesconto Imposto de renda: R$" + mascara.format(this.impostoRenda())
                    + "\nSalário liquido: R$" + mascara.format(this.salarioLiquido());
        }
        return dados;
    }
}
