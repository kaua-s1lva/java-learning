package questão_8;

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

        double angulo = Math.atan(y / x);

        System.out.println("O valor do ângulo é " + angulo);

    }
}
