package questao_3;

public class Main {
    public static void main (String[] args) {

        int x=25, y=15, aux=0;

        System.out.println("MDC(" + x + "," + y + ") =");
        while (x != y) {
            if (x > y) {
                x = x - y;
                System.out.println("MDC(" + x + "," + y + ") =");
            } else {
                aux = x;
                x = y;
                y = aux;
                System.out.println("MDC(" + x + "," + y + ") =");
            }
        }

        System.out.println("O MDC é: " + x);

    }
}
