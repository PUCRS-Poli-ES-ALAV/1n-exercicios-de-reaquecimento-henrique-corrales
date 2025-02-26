public class Exercicio4 {
    public static String reverse(String str, int len) {
        if (len < 1) return "";
        if (len == 1) return String.valueOf(str.charAt(0));
        return str.charAt(len - 1) + reverse(str, len - 1);

    }

    public static void main(String[] args) {
       String str = "EU AMO HENRIQUE CORRALES MARCHIORI";
       System.out.println(reverse(str, str.length()));

} 
}
