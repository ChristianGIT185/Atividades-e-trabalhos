package Class;

import Interfaces.FormasGeometricas;

public class Quadrado implements FormasGeometricas {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public int quantidadeArestas() {
        return 4;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }
}
