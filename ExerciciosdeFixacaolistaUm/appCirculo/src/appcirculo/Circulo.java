package appcirculo;

public class Circulo {
    private float raio;

    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    public double calcularArea (){
        double calcularArea = 3.14 * raio * raio;
        return calcularArea;
    }
    public double calcularPerimetro (){
        double calcularPerimetro = 2 * 3.14 * raio;
        return calcularPerimetro;
    }
    public float calcularDiametro (){
        float calcularDiametro = 2 * raio;
        return calcularDiametro;
    }
}
