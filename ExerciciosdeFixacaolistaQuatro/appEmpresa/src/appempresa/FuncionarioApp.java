package appempresa;

import javax.swing.JOptionPane;

public class FuncionarioApp {

    Funcionario funcionario; //criacao do obj funcionario
    private static final String appPrompt = "Informe a operação desejada \n" //private static final significa que sempre é essas informações usadas no appPrompt, desse modo não precisa ficar repetindo dentro do OptionPane 
            + "1 - Listar informações do funcionário \n"
            + "2 - Reajustar salário do funcionário \n"
            + "3 - Demitir funcionário \n"
            + "4 - Encerrar";

    public FuncionarioApp(Funcionario funcionario) {
        this.funcionario = funcionario; //O construtor dessa classe está dizendo que o objeto funcionario recebe os dados da classe Funcionario
    }

    public void app() { //void pois não tem que retornar nada, por isso não se usa return, quem exibe mensagem é JOptionPane
        String input = "0"; //a variavel que recebe os valores que fazem com que o programa funcione, no caso do while escolhendo o que deve fazer e nas outras funcoes recebendo valores para alterar na classe funcionario
        while (!input.equals("4")) {//o while so funciona se não colocar o 4 que encerra o programa
            input = JOptionPane.showInputDialog(null, "" + appPrompt, "FUNCIONÁRIO " + funcionario.getNome(), 3);
//.equals é a comparacao de == para String
            if (input.equals("1")) {
                listarInformacoes();// invés de fazer a operacao dentro do if criou-se uma funcao para entender melhor o que estava acontecendo e está chamando essa operacao
            } else if (input.equals("2")) {
                reajustarSalario();
            } else if (input.equals("3")) {
                demissao();
            } else if (input.equals("4")) {
                break;// break quer dizer que o while para de ser executado, bem util quando algum dado ou botao precisar parar o while
            } else {
                JOptionPane.showMessageDialog(null, "Insira uma opção válida!","ERRO",0);
            }
        }

    }

    public void listarInformacoes() {
        JOptionPane.showMessageDialog(null, "" + funcionario.dados());//chamando a funcao dados e está apresentando ela
    }

    public void reajustarSalario() {
        String input = JOptionPane.showInputDialog(null, "Insira a porcentagem de aumento do salário do funcionário: ");
        funcionario.bonificaFuncionario(Float.parseFloat(input)); //está insirindo no bonficaFuncionario da classe funcionario os dados que input recebeu
        JOptionPane.showMessageDialog(null, "Bonificação feita com sucesso!");
    }

    public void demissao() {
        String input = JOptionPane.showInputDialog(null, "Insira 0 para encerrar o contrato do funcionário: ");
        funcionario.encerraContrato(input);//esta alterando a situacao para demitido na classe funcionario pelo valor 0 que input recebe
        JOptionPane.showMessageDialog(null, "Alteração feita com sucesso!");
    }
}
