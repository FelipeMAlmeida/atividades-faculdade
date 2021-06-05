package appfatorial;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Fatorial fato = new Fatorial();
        do {
            fato.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor a ser fatorado:", "EX. Fatorial", 3)));
            if (fato.fatorialWhile() < 0) {
                JOptionPane.showMessageDialog(null, "O número é negativo, por favor insira um número positivo");
            } else {
                JOptionPane.showMessageDialog(null, "O fatorial de " + fato.getNumero() + " pelo método WHILE é \n" + fato.fatorialWhile(), "Ex.fatorial", 3);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja fatorar novamente?", "Fatorar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

        System.exit(0);
    }

}
