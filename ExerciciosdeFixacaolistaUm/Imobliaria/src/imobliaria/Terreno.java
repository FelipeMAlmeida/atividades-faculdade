//A imobiliária XPTO vende apenas terrenos retangulares. Faça um aplicativo para ler as dimensões 
//de um terreno e depois exibir a respectiva área.
package imobliaria;

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
