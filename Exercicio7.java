public class Exercicio7 {
    public static int[] arr (int[] nums, int index, int sum, int prod) {
        if (index < nums.length) {
            if (index == 0) prod = 1;
            sum += nums[index];
            prod *= nums[index];
            index++;
            return arr(nums, index, sum, prod);
        }
        int[] ans = new int[2];
        ans[0] = sum;
        ans[1] = prod;
        return ans;
    }

    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5};
       int[] ans = arr(nums, 0, 0, 0);
       System.out.println(ans[0]);
       System.err.println(ans[1]);
}
}
