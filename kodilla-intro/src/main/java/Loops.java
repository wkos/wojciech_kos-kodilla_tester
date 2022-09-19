public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumOfElements(array));
    }

    private static int sumOfElements(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }
}
