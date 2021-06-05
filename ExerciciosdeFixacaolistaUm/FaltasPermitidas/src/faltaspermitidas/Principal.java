
package faltaspermitidas;


import javax.swing.JOptionPane;


public class Principal {

  
    public static void main(String[] args) {
        Faltas objFaltas = new Faltas();
        objFaltas.setAulas(Float.parseFloat(JOptionPane.showInputDialog("Insira o número de aulas do semestre: ")));
        
        JOptionPane.showMessageDialog(null,"Essas são as suas faltas permitidas nesse semestre: " + objFaltas.calcularFaltasPermitidas());
        
    }
    
}
