package appfolhapagamentoheranca;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String categoriaFunc[] = {"Funcionário", "Funcionário Comissionado"};
        String nome = JOptionPane.showInputDialog(null, "Nome do Funcionário", "AppHerança", 3);
        String carteira = JOptionPane.showInputDialog(null, "Carteira de Trabalho n°", "AppHerança", 3);
        double salBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Salário Base", "AppHerança", 3));

        String opUsr = (String) JOptionPane.showInputDialog(null, "Selecione a categoria", "AppHerança", 3, null, categoriaFunc, categoriaFunc[0]);

        if (opUsr.equals("Funcionário")) {
            Funcionario funcionario = new Funcionario(nome, carteira, salBase);
            JOptionPane.showMessageDialog(null, funcionario.dadosFuncionario(), "AppHerança", 1);
        } else if (opUsr.equals("Funcionário Comissionado")) {
            double vendas = Double.parseDouble(JOptionPane.showInputDialog(null, "Total de Vendas", "AppHerança", 3));
            double percentual = Double.parseDouble(JOptionPane.showInputDialog(null, "Percentual de comissão", "AppHerança", 3));
            FuncionarioComissionado funComissionado = new FuncionarioComissionado(nome, carteira, salBase, vendas, percentual);
            JOptionPane.showMessageDialog(null, funComissionado.dadosFuncionario(), "AppHerança", 1);
        }
        System.exit(0);
    }

}
