package appprofessor;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String categoriasProf[] = {"Professor Auxiliar", "Professor Assistente", "Professor Adjunto"};
        String operacoes[] = {"Listar informações do professor", "Reajustar valor da hora", "Demitir professor", "Encerrar"};

        Professor professorUnitau;

        String matricula = JOptionPane.showInputDialog(null, "Matrícula do professor: ", "AppProfessor", 3);
        String nome = JOptionPane.showInputDialog(null, "Nome do professor: ", "AppProfessor", 3);
        String nomeCategoria = (String) JOptionPane.showInputDialog(null, "Categoria do professor: ", "AppProfessor", 3, null, categoriasProf, categoriasProf[0]);
        float valorDaHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor da hora para a categoria " + nomeCategoria, "AppProfessor", 3));

        if (JOptionPane.showConfirmDialog(null, "Professor de tempo integral?", "AppProfessor", JOptionPane.YES_NO_OPTION, 3) == 0) {
            professorUnitau = new Professor(matricula, nome, new Categoria(nomeCategoria, valorDaHora));//instanciando professor de tempo integral
        } else {
            int horasTrab = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de horas trabalhadas no mês: ", "AppProfessor", 3));
            professorUnitau = new Professor(matricula, nome, horasTrab, new Categoria(nomeCategoria, valorDaHora));
        }

        String opUsr;
        do {
            opUsr = (String) JOptionPane.showInputDialog(null, "Selecione a opção desejada", "AppProfessor", 3, null, operacoes, operacoes[0]);
            switch (opUsr) {
                case "Listar informações do professor":
                    JOptionPane.showMessageDialog(null, "" + professorUnitau.dados());
                    break;
                case "Reajustar valor da hora":
                    if (professorUnitau.isAtivo()) {
                        professorUnitau.getCategoria().reajustaValorHora(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor do percentual ser alterado")));
                    } else {
                        JOptionPane.showMessageDialog(null, "Professor inativo. Não pertence mais ao quadro da Faculdade", "AVISO", 0);
                    }
                    break;
                case "Demitir professor":
                    if (professorUnitau.isAtivo()) {
                        professorUnitau.encerraContrato();
                        JOptionPane.showMessageDialog(null, "Contrato encerrado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Professor inativo. Não pertence mais ao quadro da Faculdade", "AVISO", 0);
                    }
            }
        } while (!opUsr.equals("Encerrar"));
        System.exit(0);

    }
}
