package appempresa;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        do {
            //Não foi usado set pois eu estou adicionando valores para as variaveis pelo construtor
            String nome = JOptionPane.showInputDialog(null, "Insira o nome do funcionário: ", "Dados Cadastrais", 3);
            String matricula = JOptionPane.showInputDialog(null, "Insira o número da matrícula do funcionário: ", "Dados Cadastrais", 3);
            String departamento = JOptionPane.showInputDialog(null, "Insira o departamento do funcionário: ", "Dados Cadastrais", 3);
            float horaMes = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira as horas trabalhadas no mês: ", "Dados Cadastrais", 3));
            float salarioPorHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor das horas trabalhadas no mês: ", "Dados cadastrais", 3));

            Funcionario func = new Funcionario(nome, departamento, matricula, horaMes, salarioPorHora); //Obj func está chamando o construtor da classe funcionário e atribuindo os valores das variáveis

            FuncionarioApp funcApp = new FuncionarioApp(func); //Obj funcApp está chamando o construtor da classe FuncionarioApp
            funcApp.app();

        } while (JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro funcionário?", "Dados cadastrais", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
        System.exit(0);
    }

}
