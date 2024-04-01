package questao_10;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();

        int num = gerador.nextInt(11), tentativas = 1;

        System.out.println("Digite o número sorteado: ");
        int trynum = ler.nextInt();

        while (num != trynum) {
            if (trynum > num) {
                System.out.println("Digite um valor menor: ");
                tentativas++;
                trynum = ler.nextInt();
            } else {
                System.out.println("Digite um valor maior: ");
                trynum = ler.nextInt();
                tentativas++;
            }
        }

        System.out.println("Acertou! Você teve um total de " + tentativas + " tentativas");

        ler.close();

    }
}
