public class Sum {
    public static void main(String[] args) throws Exception {
        int[] array1 = { 5, 8, 3, 2, 3 };
        int[][] array2 = { { 9, 6, 2, 3, 6 }, { 7, 8, 9, 7, 8, 20 } };
        int sumA1 = 0;
        int sumA2 = 0;

        for (int i = 0; i < array1.length; i++) {
            sumA1 += array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sumA2 += array2[i][j];
            }
        }

        System.out.println("The sum of array1 number is " + sumA1);
        System.out.println("The sum of array2 number is " + sumA2);
    }
}
