package apptriangulo;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Triangulo objTriangulo = new Triangulo();
    JOptionPane.showMessageDialog(null,"Lembre-se de escrever os números que contém ',' com '.' ");
    objTriangulo.setLadoUm(Float.parseFloat(JOptionPane.showInputDialog("Insira o primeiro lado do Triangulo:")));
    objTriangulo.setLadoDois(Float.parseFloat(JOptionPane.showInputDialog("Insira o segundo lado do Triangulo:")));
    objTriangulo.setLadoTres(Float.parseFloat(JOptionPane.showInputDialog("Insira o terceiro lado do Triangulo:")));
    JOptionPane.showMessageDialog(null,"Com esses dados concluimos que: " + objTriangulo.tipoTriangulo());
    System.exit(0);
    }
    
}
