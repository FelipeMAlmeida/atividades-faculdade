package appimovelatrasado;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        //Atributos que recebem as informações
        String identificacao =  JOptionPane.showInputDialog(null,"Insira o número de identificação do imóvel","APP Imóvel",3);
        String nome =  JOptionPane.showInputDialog(null,"Insira o nome do proprietário do imóvel","APP Imóvel",3);
        String sobrenome =  JOptionPane.showInputDialog(null,"Insira o sobrenome do proprietário do imóvel","APP Imóvel",3);
        String cpf =  JOptionPane.showInputDialog(null,"Insira o CPF do proprietário do imóvel","APP Imóvel",3);
        double imposto = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor do imposto do imóvel","APP Imóvel",3));
        int mesesAtraso = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o número de meses de atraso do imóvel","APP Imóvel",3));
        Imovel imovel = new Imovel(identificacao,  nome,  sobrenome,  cpf,  imposto,  mesesAtraso); //Objeto imóvel
        
        JOptionPane.showMessageDialog(null," "+ imovel.informacoes(),"APP Imóvel",1);
        System.exit(0);
    }

}
