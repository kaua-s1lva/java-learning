package questao_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        double maior=0, menor=100000, media=0;
        Scanner ler = new Scanner(System.in);
        double vetor[] = new double[5];
        double impares[] = new double[5];
        double pares[] = new double[5];

        System.out.println("Digite 5 números:");
        for(i=0; i<5; i++) {
            vetor[i] = ler.nextDouble();
        }

        ler.close();

        for(i=0; i<5; i++) {
            media += vetor[i];
            if(vetor[i] > maior) {
                maior = vetor[i];
            } 
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if(vetor[i] % 2 == 0) {
                pares[i] = vetor[i];
            } else {
                impares[i] = vetor[i];
            }
        }

        media = media/5;

        System.out.println("maior valor: " + maior + "\nmenor valor: " + menor + "\nmédia: " + media);

        System.out.println("valores impares: ");
        for(i=0; i<5; i++) {
            if(impares[i] != 0) {
                System.out.println(impares[i]);
            }
        }

        System.out.println("valores pares: ");
        for(i=0; i<5; i++) {
            if(pares[i] != 0) {
                System.out.println(pares[i]);
            }
        }


    }
}
