package pessoa;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Pessoa objPessoa = new Pessoa();
        objPessoa.setNome(JOptionPane.showInputDialog("Insira o nome da pessoa"));
        objPessoa.setSobrenome(JOptionPane.showInputDialog("Insira o sobrenome da pessoa"));
        JOptionPane.showMessageDialog(null, "Esse é seu nome completo: "+objPessoa.nomeCompleto());
        System.exit(0);
    }
    
}
