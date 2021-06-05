package apptabuada;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Tabuada objTabuada = new Tabuada();
        objTabuada.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor a ser colocado na tabuada:", "Ex. Tabuada", 3)));
        JOptionPane.showMessageDialog(null, objTabuada.tabuadaWhile(), "Tabuada do número método While " + objTabuada.getNumero(), 1);
        JOptionPane.showMessageDialog(null, objTabuada.tabuadaDoWhile(), "Tabuada do número método Do While " + objTabuada.getNumero(), 1);
        JOptionPane.showMessageDialog(null, objTabuada.tabuadaFor(), "Tabuada do número método For " + objTabuada.getNumero(), 1);
        System.exit(0);
    }

}
