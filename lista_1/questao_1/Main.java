package questao_1;

import java.lang.Math;

public class Main {
    public static void main (String[] args) {
        
        int i, j = 1;
        float soma = 0, num[], den[];
        num = new float[51];
        den = new float[51];
        
        //Calculando solução 1
        for (i=1; i<=50; i++) {
            num[i] = j;
            den[i] = i;
            j += 2;
        }

        for (i=1; i<=50; i++) {
            soma += num[i] / den[i];
        }

        System.out.println("Valor solução 1: " + soma);

        //calculando solução 2
        double num2[], den2[], soma2=0;
        num2 = new double[51];
        den2 = new double[51];

        j=50;

        for (i=1; i<=50; i++) {
            den2[i] = j;
            j--;
            num2[i] = Math.pow(2, i);
            soma2 += num2[i] / den2[i];
        }

        System.out.println("\nValor solução 2: " + soma2);

        //calculando solução 3
        double num3[], den3[], soma3=0;
        num3 = new double[11];
        den3 = new double[11];

        for (i=1; i<=10; i++) {
            num3[i] = i;
            den3[i] = Math.pow(i, 2);

            if (i%2 == 0) {
                soma3 -= num3[i] / den3[i];
            } else {
                soma3 += num3[i] / den3[i];
            }
        }

        System.out.println("\nValor da solução 3: " + soma3);
    
    }
}