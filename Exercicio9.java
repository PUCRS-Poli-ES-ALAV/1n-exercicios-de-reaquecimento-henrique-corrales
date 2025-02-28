public class Exercicio9 {
    
    public static void gerarPermutacoes(char[] letras, int inicio) {
        if (inicio == letras.length - 1) {
            System.out.println(String.valueOf(letras));
            return;
        }
        
        for (int i = inicio; i < letras.length; i++) {
            trocar(letras, inicio, i);
            gerarPermutacoes(letras, inicio + 1);
            trocar(letras, inicio, i);
        }
    }
    
    private static void trocar(char[] letras, int i, int j) {
        char temp = letras[i];
        letras[i] = letras[j];
        letras[j] = temp;
    }

    public static void main(String[] args) {
        int n = 3;
        char[] letras = new char[n];

        for (int i = 0; i < n; i++) {
            letras[i] = (char) ('A' + i);
        }

        gerarPermutacoes(letras, 0);
    }
}
