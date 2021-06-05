package appimpares;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Impares imp = new Impares();
        JOptionPane.showMessageDialog(null, "O produto dos números ímpares entre 1 e 15 são: " + imp.calcula(), "Ex. Ímpares", 1);
        System.exit(0);
    }

}
