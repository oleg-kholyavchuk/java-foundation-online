package test;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = new int[] {-6, -5, -3, -2, 0, 1, 2, 5, 6, 7, 8};

        System.out.println("Позиция числа = " + Arrays.toString(array) );

        int pos0 = binarySearch(0, 0, array.length, array);

        System.out.println("Позиция числа = " + Arrays.toString(array) + " равна " + pos0);
    }

    private static int binarySearch(int num, int beginIndex, int endIndex, int[] array) {

        int mindIndex = beginIndex + (endIndex - beginIndex) / 2;

        if(num == array[mindIndex]) return mindIndex;

        if (num > array[mindIndex]) return binarySearch(num, mindIndex + 1, endIndex, array);

        return binarySearch(num, beginIndex, mindIndex - 1, array);

    }
}
