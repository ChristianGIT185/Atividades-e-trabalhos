import Class.Circulo;
import Class.Quadrado;
import Class.Retangulo;
import Class.Triangulo;
import Interfaces.FormasGeometricas;

public class App {
    public static void main(String[] args) {
        FormasGeometricas c = new Circulo(2);
        FormasGeometricas q = new Quadrado(4);
        FormasGeometricas r = new Retangulo(3, 5);
        FormasGeometricas t = new Triangulo(6, 2);

        System.out.println("Círculo - Arestas: " + c.quantidadeArestas() + ", Área: " + c.calculaArea());
        System.out.println("Quadrado - Arestas: " + q.quantidadeArestas() + ", Área: " + q.calculaArea());
        System.out.println("Retângulo - Arestas: " + r.quantidadeArestas() + ", Área: " + r.calculaArea());
        System.out.println("Triângulo - Arestas: " + t.quantidadeArestas() + ", Área: " + t.calculaArea());
    }
}
