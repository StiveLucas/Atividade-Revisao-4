package app.models.heranca;

public class Eletrodomestico {
    private String marca;
    private double potencia;

    public Eletrodomestico(String marca, double potencia){
        this.marca = marca;
        this.potencia = potencia;

    }

    public String getMarca(){
        return marca;

    }

    public double getPotencia(){
        return potencia;

    }

    public void setMarca(String marca){
        this.marca = marca;
        

    }

    
}