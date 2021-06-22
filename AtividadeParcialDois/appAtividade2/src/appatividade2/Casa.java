package appatividade2;

public class Casa extends Imovel {

    private boolean temPiscina;

    public Casa(boolean temPiscina, String nome, String endereco, boolean aluguelVenda, boolean casaApt, double preco, double qntMetros) {
        super(nome, endereco, aluguelVenda, casaApt, preco, qntMetros);
        this.temPiscina = temPiscina;
    }

    public boolean isTemPiscina() {
        return temPiscina;
    }

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }

    public String piscina() {
        if (temPiscina) {
            return "\nCom piscina";
        } else {
            return "\nSem piscina";
        }

    }

    public float taxaMensal() {
        float taxa;
        if (qntMetros <= 300) {
         taxa =(float)(qntMetros * 0.15);
        } else {
        taxa = (float)(qntMetros * 0.30);
        }
        return taxa;
    }

    @Override
    public String dados() {
        return super.dados() + piscina();
    }
}
