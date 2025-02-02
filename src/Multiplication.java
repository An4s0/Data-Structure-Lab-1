public class Multiplication {
    public static void main(String[] args) throws Exception {
        int[][] array2 = { { 1, 1, 2 }, { 2, 5, 2 }, { 4, 4, 4 }, { 3, 0, 0 } };
        int[][] array5 = { { 1, 1, 2 }, { 2, 5, 2 }, { 4, 4, 4 }, { 3, 0, 0 } };
        int[][] array6 = new int[3][4];

        System.out.println("Array6");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                array6[i][j] = array2[i][j] * array5[i][j];
                System.out.print(array6[i][j] + " ");
            }
            System.out.println();
        }
    }
}
