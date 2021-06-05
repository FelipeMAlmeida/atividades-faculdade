package appgeradorsenhas;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao seu gerador de senhas pessoal!" ,"Gerador de senhas",1);
        int qntNumeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de caracteres: ", "Gerador de senhas", 3));
        Senha senha = new Senha(qntNumeros);
        String usuario = "";
        String operacoes[] = {"Somente números", "Números e letras", "Números, letras e símbolos", "Sair"};
        while (!usuario.equalsIgnoreCase(operacoes[3])) {
            usuario = (String) JOptionPane.showInputDialog(null, "Selecione o tipo de senha desejada:", "Gerador de senhas", 3, null, operacoes, operacoes[0]);
            switch (usuario) {
                case "Somente números":
                    JOptionPane.showMessageDialog(null, "" + senha.aleatorioNumeros(),"Senha",1);
                    break;
                case "Números e letras":
                    JOptionPane.showMessageDialog(null, "" + senha.aleatorioNumerosLetras(),"Senha",1);
                    break;
                case "Números, letras e símbolos":
                    JOptionPane.showMessageDialog(null, "" + senha.aleatorioNumerosLetrasSimbolos(),"Senha",1);
            }
        }
        System.exit(0);
    }

}
