package app;

import app.models.Geladeira;
import app.models.Microondas;

public class Main {

    public static void main(String[] args) {
        
        Geladeira g = new Geladeira(25, "Goku", 25);
        Microondas m = new Microondas(4, "Vegeta", 80);

        System.out.println(g + g.ligarAparelho()+ "\n" +m + m.ligarAparelho());

    }

    
}