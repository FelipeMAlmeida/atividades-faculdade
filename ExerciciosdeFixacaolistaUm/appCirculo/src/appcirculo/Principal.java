package appcirculo;


import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
          Circulo objCirculo = new Circulo();
          objCirculo.setRaio(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do raio: ")));
          
          JOptionPane.showMessageDialog(null,"Essa é a sua area: " + objCirculo.calcularArea());
          JOptionPane.showMessageDialog(null,"Essa é o seu perimetro: " + objCirculo.calcularPerimetro());
          JOptionPane.showMessageDialog(null,"Essa é o seu diâmetro: " + objCirculo.calcularDiametro());
          System.exit(0);
    }
    
}
