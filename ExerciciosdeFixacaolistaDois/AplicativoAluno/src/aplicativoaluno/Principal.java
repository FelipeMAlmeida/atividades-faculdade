package aplicativoaluno;

import javax.swing.JOptionPane;

public class Principal {

   
    public static void main(String[] args) {
        Aluno objAluno = new Aluno();
        objAluno.setNome(JOptionPane.showInputDialog("Insira o nome do(a) aluno(a)"));
        objAluno.setRa(JOptionPane.showInputDialog("Insira o ra do(a) aluno(a)"));
        objAluno.setNotaUm(Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da primeira prova do(a) aluno(a)")));
        objAluno.setNotaDois(Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da segunda prova do(a) aluno(a)")));
        objAluno.setNotaPrincipal(Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da prova principal do(a) aluno(a)")));
        
        JOptionPane.showMessageDialog(null,"Nome do(a) aluno(a): "+objAluno.getNome()+"\n RA do(a) aluno(a): "+objAluno.getRa()+ "\n Essa é a sua area: " + objAluno.calcularMedia());
        System.exit(0);
    }
    
}
