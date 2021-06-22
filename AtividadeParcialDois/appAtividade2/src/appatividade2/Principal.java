package appatividade2;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Apartamento apt = null;
        Casa casa = null;
        boolean aluguelVenda = false;
        boolean casaApt = false;
        boolean piscina = false;


        String tipoNegocio[] = {"Aluguel", "Venda"};
        String tipoImovel[] = {"Casa", "Apartamento"};
        String operacoes[] = {"Visualizar informações do imóvel", "Consultar taxa de administradora", "Sair"};

        String tipo = (String) JOptionPane.showInputDialog(null, "Selecione o tipo de Imovel: ", "AppImovel", 3, null, tipoImovel, tipoImovel[0]);
        String nome = JOptionPane.showInputDialog(null, "Insira o nome do proprietário do imóvel", "AppImovel", 3);
        String end = JOptionPane.showInputDialog(null, "Insira o endereço do proprietário do imóvel", "AppImovel", 3);
        double tamanho = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o tamanho em m2 do imóvel", "AppImovel", 3));
        String negocio = (String) JOptionPane.showInputDialog(null, "Selecione o tipo negocio: ", "AppImovel", 3, null, tipoNegocio, tipoNegocio[0]);
        if (negocio.equals("Venda")){
            aluguelVenda=true;
        }else{
            aluguelVenda=false;
        }
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do imóvel", "AppImovel", 3));

        if (tipo.equals("Casa")) {
            casaApt = true;
            int comPiscina = JOptionPane.showConfirmDialog(null, "A casa possui piscina?", "AppImovel", JOptionPane.YES_NO_OPTION, 3);
            if (comPiscina == 0) {
                piscina=true;
            } else {
                piscina=false;
            }
            casa = new Casa(piscina, nome, end, aluguelVenda, casaApt, valor, tamanho);


        } else {
            String andar = JOptionPane.showInputDialog(null, "Insira o andar do apartamento", "AppImovel", 3);
            String nmrApt = JOptionPane.showInputDialog(null, "Insira o número do apartamento", "AppImovel", 3);
            apt = new Apartamento(andar, nmrApt, nome, end, aluguelVenda, casaApt, valor, tamanho);

        }

        String operar = "";

        do {
            operar = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada", "AppImovel", 3, null, operacoes, operacoes[0]);
            switch (operar) {
                case "Visualizar informações do imóvel":
                    if (tipo.equals("Casa")) {
                        JOptionPane.showMessageDialog(null, "" + casa.dados());
                    } else {
                        JOptionPane.showMessageDialog(null, "" + apt.dados());
                    }
                    break;

                case "Consultar taxa de administradora":
                    if (tipo.equals("Casa")) {
                        JOptionPane.showMessageDialog(null, "O valor cobrado para administrar o imóvel com" +casa.qntMetros +"m2 é " + casa.taxaMensal());
                    } else {
                        JOptionPane.showMessageDialog(null, "O valor cobrado para administrar o imóvel com" +apt.qntMetros +"m2 é " + apt.taxaMensal());
                    }

            }
        } while (!operar.equals("Sair"));
        System.exit(0);
    }

}
