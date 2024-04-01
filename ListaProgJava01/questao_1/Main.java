package questao_1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);
        double ladoA, ladoB;

        System.out.println("Digite o valor do lado A: ");
        ladoA = ler.nextDouble();

        System.out.println("Digite o valor do lado B: ");
        ladoB = ler.nextDouble();

        System.out.println("O valor da área do retângulo é: " + (ladoA * ladoB));

    }
}
