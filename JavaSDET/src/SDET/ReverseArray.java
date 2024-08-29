package SDET;

public class ReverseArray {
    public static int[] reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {12, 34, 56, 78, 90, 23, 54, 67};
        int[] reversedArray = reverseArray(array);
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
    }
}
