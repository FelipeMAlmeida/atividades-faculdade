package appempresax;

import java.text.DecimalFormat;

public class HoraExtra {

    private Cargo cargo;
    private int horasExtras;

    public HoraExtra(Cargo cargo, int horasExtras) {
        this.cargo = cargo;
        this.horasExtras = horasExtras;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    //Método que calcula a hora extra semanal
    public String calcHoraExtraSemana() {
        DecimalFormat mascara = new DecimalFormat("#,##0.00"); //máscara para que apenas dois números após a virgula apareca
        String resposta = "";
        float valorHoraExtra;
        if (cargo.getCargo().equals("Aprendiz")) {
            valorHoraExtra = horasExtras * ((cargo.getSalario() / 80) * 150 / 100);
            resposta = "R$" + mascara.format(valorHoraExtra);
        } else if (cargo.getCargo().equals("Junior")) {
            valorHoraExtra = horasExtras * ((cargo.getSalario() / 176) * 150 / 100);
            resposta = "R$" + mascara.format(valorHoraExtra);
        } else if (cargo.getCargo().equals("Pleno")) {
            valorHoraExtra = horasExtras * ((cargo.getSalario() / 176) * 150 / 100);
            resposta = "R$" + mascara.format(valorHoraExtra);
        } else if (cargo.getCargo().equals("Sênior")) {
            valorHoraExtra = horasExtras * ((cargo.getSalario() / 160) * 150 / 100);
            resposta = "R$" + mascara.format(valorHoraExtra);
        }
        return resposta;
    }

    //Método que calcula a hora extra aos domingos e feriados
    public String calcHoraExtraDomingoFeriado() {
        DecimalFormat mascara = new DecimalFormat("#,##0.00"); //máscara para que apenas dois números após a virgula apareca
        String resposta = "";
        float valorHoraExtra;
        if (cargo.getCargo().equals("Aprendiz")) {
            valorHoraExtra = horasExtras * ((cargo.getSalario() / 80) * 200 / 100);
            resposta = "R$" + mascara.format(valorHoraExtra);
        } else if (cargo.getCargo().equals("Junior")) {
            valorHoraExtra = horasExtras * ((cargo.getSalario() / 176) * 200 / 100);
            resposta = "R$" + mascara.format(valorHoraExtra);
        } else if (cargo.getCargo().equals("Pleno")) {
            valorHoraExtra = horasExtras * ((cargo.getSalario() / 176) * 200 / 100);
            resposta = "R$" + mascara.format(valorHoraExtra);
        } else if (cargo.getCargo().equals("Sênior")) {
            valorHoraExtra = horasExtras * ((cargo.getSalario() / 160) * 200 / 100);
            resposta = "R$" + mascara.format(valorHoraExtra);
        }
        return resposta;
    }
}
