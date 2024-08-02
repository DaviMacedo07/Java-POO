public class ArrayMultiDimenssional02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        for (int[] arrayBase : arrayInt) {
            for (int n : arrayBase) {
                System.out.println();
            }
        }
    }
}
