package apppositivonegativo;
/*
 Implemente um aplicativo para calcular e exibir o dobro de um número caso ele seja positivo e o seu triplo caso 
seja negativo.
*/
public class PositivoNegativo {
    float numero;

    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }
    public float numeroPositivo(){
        float positivo;
        float negativo;
    if(numero > 0 ){
        positivo = numero * 2;
        return positivo;
    }else{
        negativo = numero * 3;
        return negativo;
    }
        
    
}
}
