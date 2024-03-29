package questao_6;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        int i, j, k;
        Scanner ler = new Scanner(System.in);
        float matrizA[][] = new float[5][4]; 
        float matrizB[][] = new float[4][6];
        float matrizResultante[][] = new float[5][6];

        //lendo matriz A
        System.out.println("Digite os valores da matriz A: ");
        for (i=0; i<5; i++) {
            for (j=0; j<4; j++) {
                matrizA[i][j] = ler.nextFloat();
            }
        }

        //lendo matriz B
        System.out.println("Digite os valores da matriz B: ");
        for (i=0; i<4; i++) {
            for (j=0; j<6; j++) {
                matrizB[i][j] = ler.nextFloat();
            }
        }

        //calculando matriz resultando
        for (i=0; i<5; i++) {
            for (j=0; j<6; j++) {
                for (k=0; k<4; k++) {
                    matrizResultante[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        //imprimindo a matriz resultante
        System.out.println("Aqui está a matriz resultante: \n");
        for (i=0; i<5; i++) {
            for (j=0; j<6; j++) {
                System.out.print(matrizResultante[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
