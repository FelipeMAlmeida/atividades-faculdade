package pessoa;
/*Elabore um aplicativo para armazenar o nome e o sobrenome de uma pessoa. Implemente um método 
para permitir que seja exibido o nome completo da pessoa.
*/
public class Pessoa {
    private String nome;
    private String sobrenome;

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String nomeCompleto(){
        String nomeCompleto = nome +" "+ sobrenome;
        return nomeCompleto;
    }
}
