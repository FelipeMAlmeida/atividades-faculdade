/*
Implemente a classe Aluno, que deverá conter os seguintes atributos: nome, ra, nota do 1º bimestre e nota do 2º
bimestre. Implemente métodos (get) e (set) para todos os atributos. Implemente um método para calcular a média
obtida entre as duas avaliações e um para verificar a situação do aluno (superior ou igual a 6 – Aprovado, inferior a
4.0 – Reprovado, entre 4 e 6 – Exame) Implemente um método String dados() para retornar todas as informações
do Aluno
*/
package appmedia;

public class Aluno {
    private String nome;
    private String ra;
    private float notaPrimeiroBimestre;
    private float notaSegundoBimestre;

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

    public float getNotaPrimeiroBimestre() {
        return notaPrimeiroBimestre;
    }

    public void setNotaPrimeiroBimestre(float notaPrimeiroBimestre) {
        this.notaPrimeiroBimestre = notaPrimeiroBimestre;
    }

    public float getNotaSegundoBimestre() {
        return notaSegundoBimestre;
    }

    public void setNotaSegundoBimestre(float notaSegundoBimestre) {
        this.notaSegundoBimestre = notaSegundoBimestre;
    }
     public float valorMedia(){
         float valorMedia = (notaPrimeiroBimestre + notaSegundoBimestre) /2;
         return valorMedia;
     }
     public String situacaoAluno(){
         String situacaoAluno = String.valueOf(valorMedia());
         if (valorMedia() >= 6){
             situacaoAluno = "Aprovado!";
         }
         else if (valorMedia() < 4){
             situacaoAluno = "Reprovado!";
         }
         else if (valorMedia() >= 4 && valorMedia() < 6){
             situacaoAluno = "Exame!";
         }
           return situacaoAluno;
     }
     public String dados(){
         String dados = "Nome do(a) aluno(a): "+ nome +"\n"+"RA do(a) aluno(a): "+ ra +"\n"+"Media do(a) aluno(a): "+ valorMedia() + "\n" +"Situação do(a) aluno(a): " + situacaoAluno();
         return dados;
     }
}
