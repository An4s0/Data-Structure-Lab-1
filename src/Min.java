public class Min {
    public static void main(String[] args) throws Exception {
        int[] array1 = { 5, 8, 3, 2, 3 };
        int[][] array2 = { { 9, 6, 2, 3, 6 }, { 7, 8, 9, 7, 8, 20 } };
        int minA1 = array1[0];
        int minA2 = array2[0][0];

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < minA1) {
                minA2 = array1[i];
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i][j] < minA2) {
                    minA2 = array2[i][j];
                }
            }
        }

        System.out.println("The min of array1 number is " + minA1);
        System.out.println("The min of array2 number is " + minA2);
    }
}
