package test;

public class Duplicates {

    public static void main(String[] args) {

        int[] arrayInt = new int[] {1, 2, 4, 6, 1, 6};

        String[] array = new String[]{"s1", "s2", "s3", "s4", "s2", "s1"};

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = i + 1; j < arrayInt.length; j++) {
                if (arrayInt[i] == arrayInt[j]) {
                    System.out.println("array = " + arrayInt[i]);
                }
            }
        }
    }
}
