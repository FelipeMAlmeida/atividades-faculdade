package aplicacaoimc;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Alunos objAlunos = new Alunos();
        objAlunos.setNomeAluno(JOptionPane.showInputDialog("Insira o nome do aluno:"));
        objAlunos.setValorAltura(Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do aluno:")));
        objAlunos.setValorPeso(Double.parseDouble(JOptionPane.showInputDialog("Insira o peso do aluno:")));
        
        JOptionPane.showMessageDialog(null,"Nome do aluno: " +objAlunos.getNomeAluno() + "\n O IMC do aluno é: "
                                                                                       + objAlunos.calculoImc() + 
                                                                                       "\n Ele está com: " + objAlunos.mensagem());
        System.exit(0);
    }
    
}
