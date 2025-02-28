public class Exercicio8 {
    public static boolean isPalindromo(String str, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }
        if (str.charAt(inicio) != str.charAt(fim)) {
            return false;
        }
        return isPalindromo(str, inicio + 1, fim - 1);
    }

    public static void main(String[] args) {
        String palavra = "abcba";
        System.out.println(isPalindromo(palavra, 0, palavra.length() - 1) ? "É um palíndromo!" : "Não é um palíndromo!");
    }
}
