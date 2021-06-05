package aplicativoequacao;

public class Equacao2Grau {
    int a;
    int b;
    int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
     public float calculaDelta(){
         float calculaDelta = b*b - 4 * a * c ;
         return calculaDelta;
     }
     public String raizes() {
         double x = (-b + Math.sqrt(calculaDelta())) / 2*a;
         double y = (-b - Math.sqrt(calculaDelta())) / 2*a;
         String xUm = String.valueOf(x);
         String yUm = String.valueOf(y);
         String valor = "\n X1: "+ xUm +"\n X2: "+ yUm;
         return valor;
         
     }
}
