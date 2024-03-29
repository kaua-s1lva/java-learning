package questao_7;

import java.lang.Math;

public class Triangulo {
    private PontoCartesiano pontoA;
    private PontoCartesiano pontoB;
    private PontoCartesiano pontoC;

    public Triangulo(PontoCartesiano pontoA, PontoCartesiano pontoB, PontoCartesiano pontoC) {
        this.pontoA = pontoA;
        this.pontoB = pontoB;
        this.pontoC = pontoC;
    }

    public double calcularPerimetro() {
        double ladoA = calcularDistancia(pontoA, pontoB);
        double ladoB = calcularDistancia(pontoB, pontoC);
        double ladoC = calcularDistancia(pontoA, pontoC);

        return ladoA + ladoB + ladoC;
    }

    private double calcularDistancia(PontoCartesiano p1, PontoCartesiano p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();

        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}
