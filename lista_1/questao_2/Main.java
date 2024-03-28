package questao_2;

import java.lang.Math;

public class Main {
    public static void main (String[] args) {

        int i, a, b;

        for (i=1001; i<9999; i++) {
            a = i/100;
            b = i%100;

            if (Math.pow((a+b), 2) == i) {
                System.out.println("Valor encontrado: " + i + "\n");
            }
        }

    }
}
