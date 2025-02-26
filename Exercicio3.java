public class Exercicio3 {
    public static double fac (double times, double sum) {
        if (times > 0) {
        sum += 1/times;
        times--;
        return fac(times, sum);
        }
        return sum;
        
    }

    public static void main(String[] args) {
       System.out.println( fac(5, 0));
} 
}
