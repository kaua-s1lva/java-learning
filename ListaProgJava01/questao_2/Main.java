package questao_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double x1, x2;

        System.out.println("Digite o valor de x1: ");
        x1 = ler.nextDouble();

        System.out.println("Digite o valor de x2: ");
        x2 = ler.nextDouble();

        System.out.println("O valor das 4 operações são: \nsoma = " + (x1 + x2) + "\nproduto = " + (x1 * x2) + "\nsubtração = " + (x1 - x2) + "\ndivisão = " + (x1 / x2));

        ler.close();
    }
}
