public class Even {
    public static void main(String[] args) throws Exception {
        int[] array1 = { 5, 8, 3, 2, 3 };
        int[][] array2 = { { 9, 6, 2, 3, 6 }, { 7, 8, 9, 7, 8, 20 } };

        System.out.print("The even numbers in array1: ");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                System.out.print(array1[i] + " ");
            }
        }

        System.out.println();
        System.out.print("The even numbers in array2: ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i][j] % 2 == 0) {
                    System.out.print(array2[i][j] + " ");
                }
            }
        }
    }
}
