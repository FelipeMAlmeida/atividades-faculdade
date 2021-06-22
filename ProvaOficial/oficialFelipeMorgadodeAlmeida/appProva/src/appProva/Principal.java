package appProva;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String categoria = "";
        int novo;

        String opcoes[] = {"Exibir informações do Atleta", "Exibir Peso Ideal", "Sair"};
        String opcSexo[] = {"MASCULINO", "FEMININO"};

        do {
            String nome = JOptionPane.showInputDialog(null, "Insira o nome do Atleta", "Cadastro", 3);
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade do Atleta", "Cadastro", 3));
            String sexo = (String) JOptionPane.showInputDialog(null, "Insira o sexo do Atleta", "Cadastro", 3, null, opcSexo, opcSexo[0]);
            float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o peso do Atleta", "Cadastro", 3));
            float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a altura do Atleta", "Cadastro", 3));

            Atleta atleta = new Atleta(categoria, nome, idade, sexo, peso, altura);
            String opcUsr;

            do {

                opcUsr = (String) JOptionPane.showInputDialog(null, "Escolha uma das opções", "AppAtleta", 3, null, opcoes, opcoes[0]);
                switch (opcUsr) {

                    case "Exibir informações do Atleta":
                        JOptionPane.showMessageDialog(null, "" + atleta.dados(), "Informações", 1);
                        break;
                    case "Exibir Peso Ideal":
                        JOptionPane.showMessageDialog(null, "O peso ideal do atleta é: " + atleta.pesoIdeal(), "Peso Ideal", 1);

                }

            } while (!opcUsr.equals("Sair"));

            novo = JOptionPane.showConfirmDialog(null, "Gostaria de adicionar outro atleta?", "appAtleta", JOptionPane.YES_NO_OPTION);

        } while (novo != 1);

        System.exit(0);

    }
}
