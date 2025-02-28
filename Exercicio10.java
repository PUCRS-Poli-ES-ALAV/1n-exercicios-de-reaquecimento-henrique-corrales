public class Exercicio10 {
    public static int fibg(int f0, int f1, int n) {
        if (n == 0) {
            return f0;
        }
        if (n == 1) {
            return f1;
        }
        return fibg(f0, f1, n - 1) + fibg(f0, f1, n - 2);
    }

    public static void main(String[] args) {
        int f0 = 3;
        int f1 = 5;
        int n = 10;

        for (int i = 0; i < n; i++) {
            System.out.print(fibg(f0, f1, i) + " ");
        }
    }
}
