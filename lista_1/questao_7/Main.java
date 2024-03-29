package questao_7;

public class Main {
    public static void main (String[] args){

        PontoCartesiano pontoA = new PontoCartesiano(1, 2);
        PontoCartesiano pontoB = new PontoCartesiano(2, 3);
        PontoCartesiano pontoC = new PontoCartesiano(3, 5);

        Triangulo triangulo = new Triangulo(pontoA, pontoB, pontoC);
        double perimetro = triangulo.calcularPerimetro();

        System.out.println("Perímetro do triangulo: " + perimetro);

    }
}
