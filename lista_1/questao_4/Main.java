package questao_4;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);

        int i, vetor[], x;
        vetor = new int[11];

        System.out.println("Digite os valores do vetor: ");
        for (i=0; i<10; i++) {
            vetor[i] = ler.nextInt();
        }

        System.out.println("Digite o valor de x: ");
        x = ler.nextInt();

        ler.close();

        int maiorDiferenca = 0;
        int pos1=-1, pos2=-1;

        for (i=0; i<9; i++) {
            int diferenca = Math.abs(vetor[i] - vetor[i+1]);
            if (diferenca > maiorDiferenca) {
                maiorDiferenca = diferenca;
                pos1 = i;
                pos2 = i+1;
            }
        }

        System.out.println("as posições é: " + (pos1 + 1) + ", " + (pos2 + 1) + "\n");

        //verificando a ordenação do vetor
        int verificaDesc=0, verificaCresc=0; 

        vetor[10] = 0;
        for(i=0; i<9; i++) {
            if(vetor[i] > vetor[i+1]){
                verificaDesc++;
            } else if (vetor[i] < vetor[i+1]) {
                verificaCresc++;
            }
        }

        if (verificaDesc == 9) {
            System.out.println("O vetor é decrescente");
        } else if (verificaCresc == 9) {
            System.out.println("O vetor é crescente");
        } else {
            System.out.println("O vetor é não ordenado");
        }

        //verificando valores maiores, menores e iguais a x
        int maior=0, menor=0, igual=0;

        for (i=0; i<10; i++) {
            if(vetor[i] > x) {
                maior++;
            } else if (vetor[i] < x) {
                menor++;
            } else {
                igual++;
            }
        }

        System.out.println("Maior: " + maior + "\nMenor: " + menor + "\nIgual: " + igual);

    }
}
