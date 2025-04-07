package app.models;

import app.models.heranca.Eletrodomestico;

public class Geladeira extends Eletrodomestico {
    private int capacidade;

    public Geladeira(int capacidade, String marca, double potencia){
        super(marca, potencia);
        this.capacidade = capacidade;

    }

    public int getCapacidade(){
        return capacidade;

    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;

    }

    public String ligarAparelho(){
        return "\nA geladeira está ligando... \nGeladeira ligada";

    }

    public String toString(){
        return "Geladeira: \nMarca: "+getMarca()+ "\nCapacidade: "+capacidade+ "\nPotência: "+getPotencia();

    }
    
}