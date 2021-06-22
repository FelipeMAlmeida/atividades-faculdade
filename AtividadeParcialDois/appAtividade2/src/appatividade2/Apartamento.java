package appatividade2;

public class Apartamento extends Imovel{
    private String andar;
    private String nmrApto;

    public Apartamento(String andar, String nmrApto, String nome, String endereco, boolean aluguelVenda, boolean casaApt, double preco, double qntMetros) {
        super(nome, endereco, aluguelVenda, casaApt, preco, qntMetros);
        this.andar = andar;
        this.nmrApto = nmrApto;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String Andar) {
        this.andar = Andar;
    }

    public String getNmrApto() {
        return nmrApto;
    }

    public void setNmrApto(String nmrApto) {
        this.nmrApto = nmrApto;
    }

    public float taxaMensal() {
        float taxa;
        if (super.qntMetros <= 50) {
            taxa = (float)(qntMetros * 0.05);
        } else {
            taxa =(float)(qntMetros * 0.10);
        }
        return taxa;
    }

    @Override
    public String dados(){
        return super.dados() + "\nO andar do apartamento é: " + andar + "\nO número do apartamento é: " + nmrApto;
    }
}
