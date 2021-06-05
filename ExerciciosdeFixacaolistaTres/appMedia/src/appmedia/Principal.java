package appmedia;

import javax.swing.JOptionPane;

public class Principal {

    
    public static void main(String[] args) {
        Aluno objAluno = new Aluno();
        objAluno.setNome(JOptionPane.showInputDialog("Insira o Nome do(a) aluno(a):"));
        objAluno.setRa(JOptionPane.showInputDialog("Insira o RA do(a) aluno(a):"));
        objAluno.setNotaPrimeiroBimestre(Float.parseFloat(JOptionPane.showInputDialog("Insira a nota do primeiro bimestre:")));
        objAluno.setNotaSegundoBimestre(Float.parseFloat(JOptionPane.showInputDialog("Insira a nota do segundo bimestre:")));
        
        JOptionPane.showMessageDialog(null,"Dados do(a) aluno(a): \n" +objAluno.dados());
        System.exit(0);
    }
    
}
