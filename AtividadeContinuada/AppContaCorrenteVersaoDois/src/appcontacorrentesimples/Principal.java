package appcontacorrentesimples;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        String operacoes[] = {"Listar informações do cliente", "Efetuar um depósito", "Efetuar um saque", "Sair"};
        String nome = JOptionPane.showInputDialog(null, "Qual o primeiro nome do titular da conta: ", "Cadastro do cliente", 3);
        String sobreNome = JOptionPane.showInputDialog(null, "Qual o sobrenome do titular da conta: ", "Cadastro do cliente", 3);
        String cpf = JOptionPane.showInputDialog(null, "Qual o CPF do titular da conta: ", "Cadastro do cliente", 3);
        String numeroConta = JOptionPane.showInputDialog(null, "Qual o número da conta: ", "Cadastro do cliente", 3);
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Cadastro cliente", 1);

        ContaCorrente conCor = new ContaCorrente(numeroConta, new Titular(nome, sobreNome, cpf));
        String usuario = "";

        while (!usuario.equalsIgnoreCase(operacoes[3])) {
            usuario = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada:", "Conta Corrente", 3, null, operacoes, operacoes[0]);
            switch (usuario) {

                case "Listar informações do cliente":

                    JOptionPane.showMessageDialog(null, "" + conCor.dados(), "DADOS", 1);

                    break;
                case "Efetuar um saque":

                    conCor.saque(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor a ser sacado: ", "SAQUE", 1)));

                    break;
                case "Efetuar um depósito":

                    conCor.deposito(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor a ser depositado: ", "DEPÓSITO", 1)));

            }
        }
        System.exit(0);
    }

}
