public class Exercicio7 {
    public static int[] calcularSomaEProduto(int[] nums, int index) {
        if (index == nums.length) {
            return new int[]{0, 1};
        }

        int[] resultado = calcularSomaEProduto(nums, index + 1);
        resultado[0] += nums[index];
        resultado[1] *= nums[index];

        return resultado;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] resultado = calcularSomaEProduto(nums, 0);
        System.out.println("Soma: " + resultado[0]);
        System.out.println("Produto: " + resultado[1]);
    }
}
