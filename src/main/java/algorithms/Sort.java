package algorithms;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        int[] arrayInt = {-2, 4, -1, 0, 6, 9, -12, 34, 3, 5, 3};
        int[] nums = {8, 1, 2, 2, 3};
        int[] arrayInt2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};


        String[] arrayString = new String[]{"s1", "s9", "s3", "s4", "s2", "s1", "s5", "s3", "s1", "s8"};

        int anagrammaInt1 = 210;
        int anagrammaInt2 = 120;

        int n = 234;

//        smallerNumbersThanCurrent(nums);

        System.out.println("Arrays.toString(arrayInt) = " + Arrays.toString(arrayInt2));
        bubbleSort(arrayInt2);

//
//        quickSort(arrayInt2, 0, arrayInt2.length - 1);
        System.out.println("Arrays.toString(arrayInt) = " + Arrays.toString(arrayInt2));
//
//        System.out.println("Arrays.toString(arrayInt) = " + Arrays.toString(arrayInt));

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] array = new int[]{};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    count++;
                    System.out.println(count);
                }
            }

        }
        return array;
    }


    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) return;
        if (low >= high) return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];
        int i = low, j = high;

        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(array, i, high);
        }
        if (high > i) {
            quickSort(array, low, j);
        }
    }
}

