package app.models;

import app.models.heranca.Eletrodomestico;

public class Microondas extends Eletrodomestico {
    private int tempoMaximo;

    public Microondas(int tempoMaximo, String marca, int potencia){
        super(marca, potencia);
        this.tempoMaximo = tempoMaximo;

    }

    public int getTempoMaximo(){
        return tempoMaximo;

    }

    public void setTempoMaximo(int tempoMaximo){
        this.tempoMaximo = tempoMaximo;

    }

    public String ligarAparelho(){
        return "\nO microondas está ligando... \nMicroondas ligado";

    }

    public String toString(){
        return "\nMicroondas: \nMarca: "+getMarca()+ "\nTempo máximo: "+tempoMaximo+ "\nPotência: "+getPotencia();

    }

}