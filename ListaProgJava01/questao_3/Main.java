package questao_3;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);
        int i, j, k=0, contador=0;

        System.out.println("Digite um numero maior que 0: ");
        int numero = ler.nextInt();
        ler.close();

        //tratando excessão do 2
        if(numero >= 2) {
            contador++;
        }

        //calcular números primos
        for(i=2; i<numero; i++) {
            k=0;
            for(j=2; j<i; j++) {
                if (i % j != 0) {
                    k++;
                    if (i-2 == k) {
                        contador++;
                    }
                }
            }
        }

        System.out.println("O valor de números primos é: " + contador);


    }
}
