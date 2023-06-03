package test;

import java.util.Arrays;

public class MainTest {

    public static void main(String[] args) {

        int[] array1 = new int[]{10, 3, 2, 1, 26, 149, 101};
        int[] array2 = new int[]{101, 149, 3, 4, 26, 2, 1};

        System.out.println("array1 = " + Arrays.toString(array1));
        revers(array1);
        System.out.println("array1 = " + Arrays.toString(array1));


        System.out.println(Arrays.toString(array1));

        bubbleSort(array1);

        System.out.println(Arrays.toString(array1));

        System.out.println(Arrays.toString(array2));



        System.out.println(Arrays.toString(array2));

    }

    public static void revers (int[] validData) {
        for(int i = 0; i < validData.length / 2; i++)
        {
            int temp = validData[i];
            validData[i] = validData[validData.length - i - 1];
            validData[validData.length - i - 1] = temp;
        }
    }


    public static void bubbleSort(int[] array) {

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - j -1; i++) {
                if(array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

}
