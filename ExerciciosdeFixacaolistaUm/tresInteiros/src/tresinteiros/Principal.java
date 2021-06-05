package tresinteiros;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Inteiro objInteiros = new Inteiro();
        objInteiros.setValorUm(Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: ")));
        objInteiros.setValorDois(Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: ")));
        objInteiros.setValorTres(Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro valor: ")));
        JOptionPane.showMessageDialog(null,"Essa é a sua media: " + objInteiros.calcularMedia());
        JOptionPane.showMessageDialog(null,"Essa é a sua soma: " + objInteiros.calcularSoma());
        JOptionPane.showMessageDialog(null,"Esse é o seu produto: " + objInteiros.calcularProduto());
        
    }
    
}
