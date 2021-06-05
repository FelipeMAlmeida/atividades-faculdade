package faltaspermitidas;


public class Faltas {
    private float aulas;

    public float getAulas() {
        return aulas;
    }

    public void setAulas(float aulas) {
        this.aulas = aulas;
    }
    
    public double calcularFaltasPermitidas(){
       float calcularFaltasPermitidas = aulas  / 4;
       return calcularFaltasPermitidas;
    }
    
}
