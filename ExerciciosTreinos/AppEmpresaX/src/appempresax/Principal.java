package appempresax;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String cargo[] = {"Aprendiz", "Junior", "Pleno", "Sênior"};
        String operacoes[] = {"Listar dados do Funcionário", "Hora Extra em dias de semana", "Hora Extra aos domingos e feriados", "Sair"};

        Funcionario func; //criação obj funcionario

        String nome = JOptionPane.showInputDialog(null, "Nome do funcionário: ", "AppEmpresaX", 3);
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade do funcionário: ", "AppEmpresaX", 3));
        String tipoCargo = (String) JOptionPane.showInputDialog(null, "Cargo do Funcionário: ", "AppEmpresaX", 3, null, cargo, cargo[0]);
        String RG = JOptionPane.showInputDialog(null, "RG do funcionário: ", "AppEmpresaX", 3);
        String areaAtuacao = JOptionPane.showInputDialog(null, "Área de atuação do funcionário: ", "AppEmpresaX", 3);

        Cargo cargoFunc = new Cargo(tipoCargo); //criacao obj cargoFunc e atribuindo os valores do construtor da classe cargo
        func = new Funcionario(nome, idade, cargoFunc, RG, areaAtuacao); // atribuindo os valores do construtor da classe Funcionario ao obj

        String opUsr;
        do {
            opUsr = (String) JOptionPane.showInputDialog(null, "Selecione a opção desejada", "AppEmpresaX", 3, null, operacoes, operacoes[0]);
            switch (opUsr) {
                case "Listar dados do Funcionário":
                    JOptionPane.showMessageDialog(null, "" + func.dados());
                    break;
                case "Hora Extra em dias de semana":

                    int hora = (Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de horas extras completas: ")));
                    HoraExtra hrExtra = new HoraExtra(cargoFunc, hora);
                    JOptionPane.showMessageDialog(null, "O valor das horas extras é de: " + hrExtra.calcHoraExtraSemana());
                    break;
                case "Hora Extra aos domingos e feriados":
                    hora = (Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de horas extras completas: ")));
                    hrExtra = new HoraExtra(cargoFunc, hora);
                    JOptionPane.showMessageDialog(null, "O valor das horas extras é de: " + hrExtra.calcHoraExtraDomingoFeriado());
            }
        } while (!opUsr.equals("Sair"));
        System.exit(0);
    }

}
