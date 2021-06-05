package appautomovel;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String combustiveis[] = {"Gasolina", "Álcool", "Diesel", "Flex", "GNV"};
        String cores[] = {"Preto", "Branco", "Cinza", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho", "Roxo", "Rosa"};
        String marcas[] = {"Fiat", "Citroen", "Volkswagen", "Honda", "General Motors", "Ford", "Cherry", "Jeep", "Audi", "BMW", "Peugot", "Land Rover", "Toyota", "Nissan", "Hyundai", "Kia", "Mercedes-Benz", "Ferrari", "Jaguar", "Lamborghini", "Maserati", "Mitsubishi", "Renault", "Tesla", "Volvo"};
        String operacoes[] = {"Cadastrar automóvel", "Listar informações", "Reajustar preço de venda", "Sair"};

        Automovel meuAuto = null;//declaração do objeto
        String opcaoUsr = "";

        while (!opcaoUsr.equalsIgnoreCase(operacoes[3])) {
            opcaoUsr = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada:", "AppAutomóvel", 3, null, operacoes, operacoes[0]);

            switch (opcaoUsr) {
                case "Cadastrar automóvel":
                    String marca = (String) JOptionPane.showInputDialog(null, "Selecione a marca desejada", "Cadastro", 3, null, marcas, marcas[0]);
                    String modelo = JOptionPane.showInputDialog(null, "Informe o modelo do automóvel: ", "Cadastro", 3);
                    String cor = (String) JOptionPane.showInputDialog(null, "Selecione a cor desejada", "Cadastro", 3, null, cores, cores[0]);
                    String combustivel = (String) JOptionPane.showInputDialog(null, "Selecione o combustivel", "Cadastro", 3, null, combustiveis, combustiveis[0]);
                    float custo = Float.parseFloat(JOptionPane.showInputDialog(null, "Preço de custo", "Cadastro", 3));
                    int novo = JOptionPane.showConfirmDialog(null, "O automóvel é Zero km?", "Cadastro", JOptionPane.YES_NO_OPTION, 3);
                    if (novo == 0) {
                        meuAuto = new Automovel(marca, modelo, cor, combustivel, custo);
                    } else {
                        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do automóvel"));
                        meuAuto = new Automovel(marca, modelo, cor, combustivel, custo, ano);
                    }
                    JOptionPane.showMessageDialog(null, "Automóvel cadastrado com sucesso!", "Cadastro", 1);
                    break;
                case "Listar informações":
                    if (meuAuto != null) {
                        JOptionPane.showMessageDialog(null, meuAuto.dados(), "Listar Informações", 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cadastre o automóvel primeiro", "Listar informações", 0);
                    }
                    break;
                case "Reajustar preço de venda":
                    if (meuAuto != null) {
                        meuAuto.quantoCusta(Float.parseFloat(JOptionPane.showInputDialog(null, "Qual a porcentagem de aumento do valor do automóvel? ", "Reajustar preço de venda", 3)));
                        JOptionPane.showMessageDialog(null, "Preço reajustado com sucesso!", "Reajustar preço de venda", 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cadastre o automóvel primeiro", "Reajustar preço de venda", 0);
                    }

            }//fim da estrutura switch
        }//fim da estrutura while

        System.exit(0);
    }

}
