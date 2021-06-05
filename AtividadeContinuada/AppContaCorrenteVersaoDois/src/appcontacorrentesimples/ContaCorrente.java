package appcontacorrentesimples;

import javax.swing.JOptionPane;

/**
 * Implemente um aplicativo “AppContaCorrenteSimples” que possui uma classe
 * ContaCorrente com atributos como número da conta, o nome do titular e o
 * saldo. Implemente construtor(es) e métodos de acesso aos atributos.
 * Implemente métodos para permitir saque e depósito na conta corrente. É
 * necessário prever que o saque deverá ser permitido somente em caso de haver
 * saldo. Caso contrário deverá ser emitida uma mensagem alertando o cliente
 * sobre o ocorrido. Implemente uma classe com um método principal, de forma a
 * exemplificar o uso das classes implementadas. Ao usuário deverá ser dada a
 * oportunidade de, após a conta ter sido criada, selecionar se ele deseja
 * consultar o saldo, depositar ou sacar.
 */
public class ContaCorrente {

    private String numeroConta;
    private Titular titular;
    private float saldo;

    public ContaCorrente(String numeroConta, Titular titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String dados() {
        return "Dados do usuário:"
                + "\nNome: " + titular.nomeCompleto()
                + "\nCPF: " + titular.getCpf()
                + "\nNúmero da Conta: " + numeroConta
                + "\nsaldo: " + saldo;
    }

    public void saque(float valorSacado) {
        if (valorSacado > 0) {
            if (saldo >= valorSacado) {
                saldo = saldo - valorSacado;
                JOptionPane.showMessageDialog(null, "Saque feito com sucesso!", "SAQUE", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Você não possui saldo", "SAQUE", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você inseriu um valor negativo", "SAQUE", 0);
        }
    }

    public void deposito(float valorDepositado) {
        if (valorDepositado > 0) {
            saldo += saldo + valorDepositado;
            JOptionPane.showMessageDialog(null, "Depósito efetuado com sucesso", "DEPÓSITO", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Você inseriu um valor negativo", "DEPÓSITO", 0);
        }
    }
}
