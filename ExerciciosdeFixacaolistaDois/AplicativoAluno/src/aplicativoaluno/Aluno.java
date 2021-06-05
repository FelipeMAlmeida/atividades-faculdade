package aplicativoaluno;

/*
Elabore um aplicativo para armazenar o ra, nome, nota do instrumento parcial 1, nota do instrumento 
parcial 2 e nota do instrumento principal. Implemente método para calcular a média do aluno sabendo 
que é o somatório de todos os instrumentos. Exiba o ra, o nome e a média obtida pelo aluno
*/

public class Aluno {
    private String nome;
    private String ra;
    private double notaUm;
    private double notaDois;
    private double notaPrincipal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getNotaUm() {
        return notaUm;
    }

    public void setNotaUm(double notaUm) {
        this.notaUm = notaUm;
    }

    public double getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(double notaDois) {
        this.notaDois = notaDois;
    }

    public double getNotaPrincipal() {
        return notaPrincipal;
    }

    public void setNotaPrincipal(double notaPrincipal) {
        this.notaPrincipal = notaPrincipal;
    }
    
    
    public double calcularMedia(){
        double calcularMedia = notaUm + notaDois + notaPrincipal;
        return calcularMedia;
    }

}
