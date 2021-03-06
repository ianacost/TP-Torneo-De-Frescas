package ar.edu.utn.mdp.humano;

import ar.edu.utn.mdp.humano.beber.BeberEspartanoImp;
import ar.edu.utn.mdp.humano.orinar.OrinarEspartanoImp;

import java.util.Random;

public class Espartano extends Humano {
    private Integer toleranciaExtra;
    private Random random;

    public Espartano(Integer toleranciaExtra, String nombre, Integer edad, Integer peso, Integer aguante) {
        super(nombre, edad, peso, aguante, new OrinarEspartanoImp(), new BeberEspartanoImp());
        this.random = new Random();
        this.toleranciaExtra = toleranciaExtra;
    }

    @Override
    public Integer orinar() {
        return super.orinar() - toleranciaExtra;
    }
}
