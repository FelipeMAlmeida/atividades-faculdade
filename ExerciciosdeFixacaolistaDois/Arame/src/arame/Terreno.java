package arame;
/*
Elabore um aplicativo, que utiliza os conceitos de orientação a objetos (OO), para calcular a 
quantidade de arame necessária para cercar um terreno com c (comprimento) por l (largura). O 
comprimento e a largura deverão ser informados pelo usuário. 
*/
public class Terreno {
     double largura ;
    double altura ;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularAreaTerreno(){ 
        double area = largura * altura;
        return area;
    }
}
