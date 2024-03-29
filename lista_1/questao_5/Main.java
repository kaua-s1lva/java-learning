package questao_5;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);

        int i, numeros[], razao, verificador=0;
        numeros = new int[10];

        for (i=0; i<10; i++) {
            numeros[i] = ler.nextInt();
        }

        razao = numeros[1] - numeros[0];

        for (i=0; i<9; i++) {
            if ((numeros[i] + razao) == numeros[i+1]) {
                verificador++;
            }
        }

        if(verificador == 9) {
            System.out.println("É uma PA. \nTermo inicial: " + numeros[0] + "\nRazão: " + razao);
        }

    }
}
