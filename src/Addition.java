public class Addition {
    public static void main(String[] args) throws Exception {
        int[] array1 = { 5, 8, 3, 2, 5, 90 };
        int[] array3 = { 10, 10, 20, 5, 100, 2 };
        int[] array4 = new int[array1.length];

        for (int i = 0; i < array4.length; i++) {
            array4[i] = array1[i] + array3[i];
        }

        System.out.println("Array4:");
        for (int i = 0; i < array4.length; i++) {
            System.out.print(" " + array4[i]);
        }
    }
}
