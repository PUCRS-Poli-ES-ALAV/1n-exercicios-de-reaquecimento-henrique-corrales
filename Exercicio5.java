public class Exercicio5 {
    public static int sequencia(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return 2 * sequencia(n - 1) + 3 * sequencia(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(sequencia(i) + " ");
        }
    }
}
