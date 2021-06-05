/**
 * c. Implemente a classe AutomovelPlus que deverá conter, além das informações da classe
 * Automóvel, as seguintes: private boolean gps, private boolean bluetooth, private boolean
 * sensorEstacionamento e private boolean cadeirinhaBebe.
 * d. Implemente o(s) construtor(es) e métodos para visualizar e alterar o valor dos atributos.
 * e. Implemente um método String toString() para retornar um texto com todas as
 * informações do AutomovelPlus
 * O método double quantoCusta() para o AutomovelPlus deverá ser calculado em função
 * do tipo de combustível acrescido dos opcionais, conforme a tabela:
 * OPCIONAL VALOR
 * GPS 780.0
 * Bluetooth 450.0
 * Sensor de estacionamento 1180.0
 * Cadeirinha para bebê 380.0
 *
 */
package appautomovel;

import java.time.LocalDate;

public class AutomovelPlus extends Automovel {

    private boolean gps;
    private boolean bluetooth;
    private boolean sensorEstacionamento;
    private boolean cadeirinhaBebe;

    public AutomovelPlus(boolean gps, boolean bluetooth, boolean sensorEstacionamento, boolean cadeirinhaBebe, String marca, String modelo, String cor, String combustivel, float precoCusto, int ano) {
        super(marca, modelo, cor, combustivel, precoCusto);
        this.gps = gps;
        this.bluetooth = bluetooth;
        this.sensorEstacionamento = sensorEstacionamento;
        this.cadeirinhaBebe = cadeirinhaBebe;
        this.ano = ano;
    }

    public AutomovelPlus(boolean gps, boolean bluetooth, boolean sensorEstacionamento, boolean cadeirinhaBebe, String marca, String modelo, String cor, String combustivel, float precoCusto) {
        super(marca, modelo, cor, combustivel, precoCusto);
        this.gps = gps;
        this.bluetooth = bluetooth;
        this.sensorEstacionamento = sensorEstacionamento;
        this.cadeirinhaBebe = cadeirinhaBebe;
        ano = LocalDate.now().getYear();
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isSensorEstacionamento() {
        return sensorEstacionamento;
    }

    public void setSensorEstacionamento(boolean sensorEstacionamento) {
        this.sensorEstacionamento = sensorEstacionamento;
    }

    public boolean isCadeirinhaBebe() {
        return cadeirinhaBebe;
    }

    public void setCadeirinhaBebe(boolean cadeirinhaBebe) {
        this.cadeirinhaBebe = cadeirinhaBebe;
    }

    @Override
    public double quantoCusta() {
        double valorVenda = super.quantoCusta();

        if (gps) {
            valorVenda += 780;

        }
        if (bluetooth) {
            valorVenda += 450;

        }
        if (sensorEstacionamento) {
            valorVenda += 1180;

        }
        if (cadeirinhaBebe) {
            valorVenda += 380;

        }
        return valorVenda;
    }

    public String acessorios() {

        String acessorios = "\nO automóvel possui os seguintes acessórios: ";
        if (gps) {

            acessorios += "\nGPS";
        }
        if (bluetooth) {

            acessorios += "\nBluetooth";
        }
        if (sensorEstacionamento) {

            acessorios += "\nSensor de estacionamento";
        }
        if (cadeirinhaBebe) {

            acessorios += "\nCadeirinha de Bebê";
        }else{
        return acessorios = "\nO automóvel não possui acessórios";
    }
        return acessorios;
    }

}
