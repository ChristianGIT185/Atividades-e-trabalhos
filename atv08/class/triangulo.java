package class;

import Interfaces.FormasGeometricas;

public class Triangulo implements FormasGeometricas {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int quantidadeArestas() {
        return 3;
    }

    @Override
    public double calculaArea() {
        return (base * altura) / 2;
    }
}
