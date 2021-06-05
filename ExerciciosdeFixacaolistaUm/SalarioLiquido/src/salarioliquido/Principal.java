package salarioliquido;


import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Professor objProfessor = new Professor();
            objProfessor.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora: "))); //código para receber dados do usuário tipo float.
            objProfessor.setQtdeHoras(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas no mês: "))); //código para receber dados do usário tipo int.
            objProfessor.setPercentualInss(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do percentual do INSS: ")));

            JOptionPane.showMessageDialog(null,"Salário Líquido: "+objProfessor.salarioLiquido(),"AppFolhaPgtoProfessor",1);
            JOptionPane.showMessageDialog(null,"Salário Bruto: "+objProfessor.salarioBruto(),"AppFolhaPgtoProfessor",1);
            JOptionPane.showMessageDialog(null,"Desconto INSS: "+objProfessor.inss(),"AppFolhaPgtoProfessor",1);
    }
}
