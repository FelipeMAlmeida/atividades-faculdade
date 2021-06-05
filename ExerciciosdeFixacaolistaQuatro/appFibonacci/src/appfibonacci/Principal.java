package appfibonacci;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        do {
            fibo.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de termos para a série fibonacci: ", "Ex. Fibonacci", 3)));
            JOptionPane.showMessageDialog(null, "A seguir os números da série de Fibonacci até o termo " + fibo.getNumero() + " : ", "Ex. Fibonacci", 3);
            JOptionPane.showMessageDialog(null, "Método While: \n" + fibo.sequenciaWhile(), "Ex. Fibonacci", 1);
            JOptionPane.showMessageDialog(null, "Método Do While: \n" + fibo.sequenciaDoWhile(), "Ex. Fibonacci", 1);
            JOptionPane.showMessageDialog(null, "Método For: \n" + fibo.sequenciaFor(), "Ex. Fibonacci", 1);

        } while (JOptionPane.showConfirmDialog(null, "Deseja escolher outro termo?", "Fibonacci", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
        System.exit(0);
    }

}
