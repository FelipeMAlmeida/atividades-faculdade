package appempresax;

public class Cargo {

    //Atributos
    private String cargo;
    private float salario;

    //Construtor iniciadno apenas o cargo, pois as Horas Extras e o salarios são usados e/ou iniciados apenas nessa classe
    public Cargo(String cargo) {
        this.cargo = cargo;
        salario(); // quando o construtor inicia ele automaticamente chama o metodo salario
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    //Método salário tem o objetivo de atribuir o valor do salario pré definido pelo sistema a partir do cargo escolhido 
    public String salario() {
        String resposta = "";
        if (cargo.equals("Aprendiz")) {
            salario = 800;
            resposta = "R$" + salario;
        } else if (cargo.equals("Junior")) {
            salario = 2500;
            resposta = "R$" + salario;
        } else if (cargo.equals("Pleno")) {
            salario = 4000;
            resposta = "R$" + salario;
        } else if (cargo.equals("Sênior")) {
            salario = 6000;
            resposta = "R$" + salario;
        }
        return resposta;
    }

}
