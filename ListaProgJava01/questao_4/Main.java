package questao_4;

public class Main {
    public static void main (String[] args) {

        int i;
        int vetorA[] = {5, 4, 6, 6, 2, 7, 6, 3, 9, 1};
        int vetorB[] = {2, 1, 3, 2, 0, 5, 0, 9, 5, 3};
        int vetorC[] = new int[10];

        for (i=0; i<10; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
        }

        System.out.println("Este é o produto escalar: ");
        for (i=0; i<10; i++) {
            System.out.print(vetorC[i] + " ");
        }

    }
}
