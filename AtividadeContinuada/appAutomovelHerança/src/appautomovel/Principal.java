package appautomovel;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        boolean gps = false;
        boolean bluetooth = false;
        boolean sensorEstacionamento = false;
        boolean cadeirinhaBebe = false;
        String categoria[] = {"Automóvel Simples", "Automóvel com Acessórios"};
        String combustiveis[] = {"Gasolina", "Álcool", "Diesel", "Flex", "GNV"};
        String cores[] = {"Preto", "Branco", "Cinza", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho", "Roxo", "Rosa"};
        String marcas[] = {"Fiat", "Citroen", "Volkswagen", "Honda", "General Motors", "Ford", "Cherry", "Jeep", "Audi", "BMW", "Peugot", "Land Rover", "Toyota", "Nissan", "Hyundai", "Kia", "Mercedes-Benz", "Ferrari", "Jaguar", "Lamborghini", "Maserati", "Mitsubishi", "Renault", "Tesla", "Volvo"};

        Automovel meuAuto = null;
        AutomovelPlus meuAutoPlus = null;

        String opcaoUsr = (String) JOptionPane.showInputDialog(null, "Selecione o tipo de automóvel", "appAutomovel", 3, null, categoria, categoria[0]);
        String marca = (String) JOptionPane.showInputDialog(null, "Selecione a marca desejada", "Cadastro", 3, null, marcas, marcas[0]);
        String modelo = JOptionPane.showInputDialog(null, "Informe o modelo do automóvel: ", "Cadastro", 3);
        String cor = (String) JOptionPane.showInputDialog(null, "Selecione a cor desejada", "Cadastro", 3, null, cores, cores[0]);
        String combustivel = (String) JOptionPane.showInputDialog(null, "Selecione o combustivel", "Cadastro", 3, null, combustiveis, combustiveis[0]);
        float custo = Float.parseFloat(JOptionPane.showInputDialog(null, "Preço de custo", "Cadastro", 3));
        int novo = JOptionPane.showConfirmDialog(null, "O automóvel é Zero km?", "Cadastro", JOptionPane.YES_NO_OPTION, 3);
        if (novo == 0) {
            if (opcaoUsr.equals("Automóvel Simples")) {
                meuAuto = new Automovel(marca, modelo, cor, combustivel, custo);
            } else {
                meuAutoPlus = new AutomovelPlus(gps, bluetooth, sensorEstacionamento, cadeirinhaBebe, marca, modelo, cor, combustivel, custo);
            }
        } else {
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do automóvel"));
            if (opcaoUsr.equals("Automóvel Simples")) {
                meuAuto = new Automovel(marca, modelo, cor, combustivel, custo, ano);
            } else {
                meuAutoPlus = new AutomovelPlus(gps, bluetooth, sensorEstacionamento, cadeirinhaBebe, marca, modelo, cor, combustivel, custo, ano);
            }
        }
        if (opcaoUsr.equals("Automóvel Simples")) {

            JOptionPane.showMessageDialog(null, "" + meuAuto);
        } else {

            int temGps = JOptionPane.showConfirmDialog(null, "O automóvel tem GPS?", "Acessórios", JOptionPane.YES_NO_OPTION, 3);
            if (temGps == 0) {
                meuAutoPlus.setGps(true);

            }
            int temBlueto = JOptionPane.showConfirmDialog(null, "O automóvel tem Bluetooth?", "Acessórios", JOptionPane.YES_NO_OPTION, 3);
            if (temBlueto == 0) {
                meuAutoPlus.setBluetooth(true);

            }
            int temSensor = JOptionPane.showConfirmDialog(null, "O automóvel tem Sensor de estacionamento?", "Acessórios", JOptionPane.YES_NO_OPTION, 3);
            if (temSensor == 0) {
                meuAutoPlus.setSensorEstacionamento(true);

            }
            int temcadeirinha = JOptionPane.showConfirmDialog(null, "O automóvel tem Cadeirinha de Bebê?", "Acessórios", JOptionPane.YES_NO_OPTION, 3);
            if (temcadeirinha == 0) {
                meuAutoPlus.setCadeirinhaBebe(true);

            }
            JOptionPane.showMessageDialog(null, "" + meuAutoPlus + meuAutoPlus.acessorios());
        }

        System.exit(0);
    }

}
