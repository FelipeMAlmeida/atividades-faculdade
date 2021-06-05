package appproduto;

/*
Elabore um aplicativo para calcular o valor a ser pago por um produto, considerando o preço normal de etiqueta e 
a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento 
escolhida e efetuar o cálculo adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque Desconto de 10%
2 À vista no cartão de crédito Desconto de 15%
3 Em duas vezes Preço normal da etiqueta sem juros
4 Em três vezes Preço normal de etiqueta mais 10% de juros
 */
public class Pagamento {

    float valorEtiqueta;
    float tipoPagamento;

    public float getValorEtiqueta() {
        return valorEtiqueta;
    }

    public void setValorEtiqueta(float valorEtiqueta) {
        this.valorEtiqueta = valorEtiqueta;
    }

    public float getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(float tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public float metodoPagamento() {
        float valorFinal = 0;
        if (tipoPagamento == 0) {
            valorFinal = valorEtiqueta - valorEtiqueta * 10 / 100;

        } else if (tipoPagamento == 1) {
            valorFinal = valorEtiqueta - valorEtiqueta * 15 / 100;

        } else if (tipoPagamento == 2) {
            valorFinal = valorEtiqueta;

        } else if (tipoPagamento == 3) {
            valorFinal = valorEtiqueta + valorEtiqueta * 10 / 100;

        }
        return valorFinal;
    }

}
