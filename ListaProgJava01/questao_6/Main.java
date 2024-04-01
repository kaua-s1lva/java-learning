package questao_6;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);
        int i, j;
        double nota1, nota2;
        double alunos[][] = new double[10][2];

        for(i=0; i<10; i++) {
            for(j=0; j<2; j++) {
                System.out.println("Digite a nota " + j + " do aluno " + i + " :");
                alunos[i][j] = ler.nextDouble();
            }
        }

        System.out.println("Aqui estão as notas e as médias: ");
        System.out.println("aluno | nota 1 | nota 2 | média");
        for(i=0; i<10; i++) {
            System.out.println("  " + (i+1) + "    " + alunos[i][0] + "    " + alunos[i][1] + "    " + ((alunos[i][0] + alunos[i][1]) / 2));
        }

    }
}
