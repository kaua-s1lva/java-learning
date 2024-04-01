package questao_7;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor x: ");
        double x = ler.nextDouble();
        System.out.println("Digite o valor y: ");
        double y = ler.nextDouble();
        ler.close();

        double dist = Math.sqrt( (Math.pow(x, 2)) + (Math.pow(y, 2)) );

        System.out.println("O valor da distância euclidiana é: " + dist);

    }
}
