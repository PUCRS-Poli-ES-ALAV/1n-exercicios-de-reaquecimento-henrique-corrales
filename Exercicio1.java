public class Exercicio1 {

    public static int mul (int num, int times, int sum) {
            if (times > 0) {
            sum += num;
            times--;
            return mul(num, times, sum);
            }
            return sum;
            
        }
    
        public static void main(String[] args) {
           System.out.println( mul(8,6, 0));
    }
}