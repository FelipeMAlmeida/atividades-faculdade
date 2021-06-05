package calculoimc;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Atleta objAtleta = new Atleta();
        objAtleta.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Insira a altura do(a) atleta")));
        objAtleta.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Insira o peso do(a) atleta")));
        JOptionPane.showMessageDialog(null,"O IMC do(a) atleta é:  "+objAtleta.calculoImc());
        System.exit(0);
    }
    
}
