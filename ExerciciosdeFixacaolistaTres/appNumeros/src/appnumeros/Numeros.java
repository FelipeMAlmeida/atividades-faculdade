package appnumeros;

/*6. Implemente uma classe com três informações do tipo inteiro. Implemente métodos para manipular as três 
informações e métodos para:
a) Retornar o maior número;
b) Retornar o menor número;
c) Retornar os três números em ordem crescente;
d) A soma, se todos os números forem pares;
e) O produto se pelo menos dois forem ímpares
*/

public class Numeros {
    int numeroUm;
    int numeroDois;
    int numeroTres;

    public int getNumeroUm() {
        return numeroUm;
    }

    public void setNumeroUm(int numeroUm) {
        this.numeroUm = numeroUm;
    }

    public int getNumeroDois() {
        return numeroDois;
    }

    public void setNumeroDois(int numeroDois) {
        this.numeroDois = numeroDois;
    }

    public int getNumeroTres() {
        return numeroTres;
    }

    public void setNumeroTres(int numeroTres) {
        this.numeroTres = numeroTres;
    }
    
    public String maiorNumero(){
        if (numeroUm > numeroDois && numeroUm> numeroTres){
                String numeroMaior = "O Primeiro número é o maior " + numeroUm;
                return numeroMaior;
        } else if (numeroDois > numeroUm && numeroDois> numeroTres){
                String numeroMaior = "O Segundo número é o maior " + numeroDois;
                return numeroMaior;
        } else if (numeroTres > numeroUm && numeroTres> numeroDois){
                String numeroMaior = "O Terceiro número é o maior " + numeroTres;
                return numeroMaior;
        }
        return null;
    }
    public String menorNumero(){
        if (numeroUm < numeroDois && numeroUm < numeroTres){
                String numeroMenor = "O Primeiro número é o menor " + numeroUm;
                return numeroMenor;
        } else if (numeroDois < numeroUm && numeroDois < numeroTres){
                String numeroMenor = "O Segundo número é o menor " + numeroDois;
                return numeroMenor;
        } else if (numeroTres < numeroUm && numeroTres < numeroDois){
                String numeroMenor = "O Terceiro número é o menor " + numeroTres;
                return numeroMenor;
        }
        return null;
    }
     public String ordemCrescente(){
        if (numeroUm < numeroDois && numeroUm< numeroTres && numeroDois < numeroTres){
                String sequencia =  numeroUm + " " + numeroDois + " " +numeroTres ;
                return sequencia;
        }
        else if (numeroDois < numeroUm && numeroDois< numeroTres && numeroUm < numeroTres){
                String sequencia =  numeroDois + " " + numeroUm + " " +numeroTres ;
                return sequencia;
        }
        else if (numeroTres < numeroUm && numeroTres< numeroDois && numeroUm < numeroDois){
                String sequencia =  numeroTres + " " + numeroUm + " " +numeroDois ;
                return sequencia;
        }
        else if (numeroUm < numeroDois && numeroUm< numeroTres && numeroTres < numeroDois){
                String sequencia =  numeroUm + " " + numeroTres + " " +numeroDois ;
                return sequencia;
        }
        else if (numeroDois < numeroUm && numeroDois< numeroTres && numeroTres < numeroUm){
                String sequencia =  numeroDois + " " + numeroTres + " " +numeroUm ;
                return sequencia;
        }
        else if (numeroTres < numeroUm && numeroTres< numeroDois && numeroDois < numeroUm){
                String sequencia =  numeroTres + " " + numeroDois + " " +numeroUm ;
                return sequencia;
        }
        
        return null;
    }
        public boolean numerosPares(){
            boolean numerosPares = true;
            boolean naoPares = false;
        if (( numeroTres % 2 == 0 && numeroUm % 2 == 0 && numeroDois % 2 == 0) == true){
                return numerosPares;
        }else {
            return naoPares;
        }

        }
                public int saoPares(){
            if (numerosPares()==true){
                int numeroPar = numeroDois + numeroTres + numeroUm;
                return numeroPar;
            }
        return 0;
        
        
    }
        public int numerosImpares (){
            if (numerosPares()==false){
           if (( numeroTres % 2 != 0 && numeroUm % 2 != 0 && numeroDois % 2 != 0)){
                int numeroImpar = numeroUm * numeroDois * numeroTres ; 
                return numeroImpar;
        }else if (( numeroTres % 2 != 0 && numeroUm % 2 != 0 && numeroDois % 2 == 0)){
                int numeroImpar = numeroUm * numeroDois * numeroTres ; 
                return numeroImpar;
        }else if (( numeroTres % 2 != 0 && numeroUm % 2 == 0 && numeroDois % 2 != 0)){
                int numeroImpar = numeroUm * numeroDois * numeroTres ; 
                return numeroImpar;
        }else if (( numeroTres % 2 == 0 && numeroUm % 2 != 0 && numeroDois % 2 != 0)){
                int numeroImpar = numeroUm * numeroDois * numeroTres ; 
                return numeroImpar;
        }
            }
        return 0;
        }
    
}
