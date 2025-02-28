public class Exercicio2 {

    public static int soma(int a, int b) {
        if (b == 0) {
            return a;
        }
        return soma(a + 1, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(soma(3, 2));
    }
}