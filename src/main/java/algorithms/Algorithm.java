package algorithms;

import java.util.*;

@SuppressWarnings("All")
public class Algorithm {

    public static void main(String[] args) {


        String[] arrayString = new String[]{"s1", "s2", "s3", "s4", "s2", "s1", "s5", "s3", "s1", "s8"};

        char[] word = new char[]{'a', 'n', 'd', 'n', 'a'};

        String anagramma1 = "dada";

        String anagramma2 = "adad";

        int i = 5;
        int i2 = -121;


        int anagrammaInt1 = 210;
        int anagrammaInt2 = 120;

        String strInt = "190";

        String roman = "XI";

        String stringRevers = "Мама ела кашу";

        String address = "1.1.1.1";

        String[] strArray = new String[]{"X++", "++X", "--X", "X--"};

        int[][] arrayTwoArray1 = new int[][]{{1, 2, 3}, {3, 2, 1}};
        int[][] arrayTwoArray2 = new int[][]{{1, 5}, {7, 3}, {3, 5}};
        int[][] arrayTwoArray3 = new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

        String[] sentences1 = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] sentences2 = new String[]{"please wait", "continue to fight", "continue to win"};

        int num = 2932;

        int[] nums1 = new int[]{1, 2, 3, 1, 1, 3};
        int[] nums2 = new int[]{1, 15, 6, 3};

        String jewels1 = "aA", stones1 = "aAAbbbb";
        String jewels = "z", stones = "ZZ";


        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;

        int[] nums3 = {8,1,2,2,3};

        System.out.println("fibonachi(11) = " + Arrays.toString(fibonachi(11)));

        fibonachi1(11);


//        System.out.println("smallerNumbersThanCurrent(nums3) = " + Arrays.toString(smallerNumbersThanCurrent(nums3)));
//
//        System.out.println("kidsWithCandies1() = " + kidsWithCandies1(candies, extraCandies));
//
//        minPartitions(strInt);

//        System.out.println("charCount(a, anagramma1) = " + charCount('у', stringRevers));

//        minimumSum(num);

//        System.out.println("smallestEvenMultiple(i) = " + smallestEvenMultiple(i));

//        System.out.println("uildArray(arrayInt) = " + Arrays.toString(runningSum(arrayInt4)));


//
//        System.out.println("romanToInt(roman) = " + romanToInt(roman));

//        System.out.println("numDecodings(anagramma1) = " + numDecodings(strInt));
//
//        System.out.println("gcdByEuclidsAlgorithm = " + gcdByEuclidsAlgorithm(anagrammaInt1, anagrammaInt2));

//        System.out.println("reversString(stringRevers) = " + reversString(stringRevers));
//
//        System.out.println("revers(stringRevers) = " + revers(stringRevers));

//        System.out.println("isPalindrome(string) = " + isPalindrome(i2));
//
//        System.out.println("istPalindrom(word) = " + istPalindrom(word));

//       System.out.println("isAnagram = " + isAnagram(anagrammaInt1, anagrammaInt2));

        //isAnagram(anagrammaInt1, anagrammaInt2);
//
//        isAnagram(i, anagrammaInt2);

//        System.out.println("characterStatistics(anagramma1) = " + characterStatistics(stringRevers));


//        System.out.println("arrayInt = " + Arrays.toString(arrayInt));
//
//        revers(arrayString);
//
////        System.out.println("arrayInt = " + Arrays.toString(arrayString));
//
//        System.out.println("duplicate(arrayString) = " + duplicate(arrayString));
//        System.out.println("notDuplicate(arrayString) = " + notDuplicate(arrayString));

//        int pos0 = binarySearch(0, 0, array.length, array);
//
//        System.out.println("Позиция числа = " + Arrays.toString(array ) + " равна " + pos0);


//        quickSort(arrayInt, 0, arrayInt.length - 1);
//
//        System.out.println("arrayInt = " + Arrays.toString(arrayInt));
//
//        printPairSums(arrayInt, 6);


    }

    public static void printPairSums(int[] array, int sum) {
        Arrays.sort(array);
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            int s = array[first] + array[last];
            if (s == sum) {
                System.out.println(array[first] + "," + array[last]);
                first++;
                last--;
            } else {
                if (s < sum) {
                    first++;
                } else last--;
            }
        }
    }

    public static void revers(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static String reversString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String revers(String str) {
        char[] in = str.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

    public static void revers(String[] array) {

        for (int i = 0; i < array.length / 2; i++) {

            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static int revers(int number) {
        int reversedNumber = 0;
        int numberToReverse = Math.abs(number);

        while (numberToReverse > 0) {
            int mod = numberToReverse % 10;
            reversedNumber = reversedNumber * 10 + mod;
            numberToReverse /= 10;
        }

        return number < 0 ? reversedNumber * -1 : reversedNumber;
    }

    public static Set<String> duplicate(String[] array) {

        Set<String> stringSet = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    stringSet.add(array[i]);
                }
            }
        }
        return stringSet;
    }

    public static Set<Integer> duplicate(int[] array) {

        Set<Integer> stringSet = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == (array[j])) {
                    stringSet.add(array[i]);
                }
            }
        }
        return stringSet;
    }

    public static Set<String> notDuplicate(String[] array) {

        Set<String> stringSet1 = new HashSet<>();
        Set<String> stringSet2 = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    stringSet2.add(array[i]);
                } else {
                    stringSet1.add(array[j]);
                }
            }
        }
        stringSet1.removeAll(stringSet2);
        return stringSet1;
    }


    private static int binarySearch(int num, int beginIndex, int endIndex, int[] array) {
        int mindIndex = beginIndex + (endIndex - beginIndex) / 2;
        if (num == array[mindIndex]) return mindIndex;
        if (num > array[mindIndex]) return binarySearch(num, mindIndex + 1, endIndex, array);
        return binarySearch(num, beginIndex, mindIndex - 1, array);
    }

    public static boolean istPalindrome(char[] word) {
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int i) {

        if (i == 0) return true;
        if (i < 0 || i % 10 == 0) return false;

        int palindrome = i;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (i == reverse) return true;
        return false;
    }

    public static boolean isAnagram(String string1, String string2) {

        if (string1.length() != string2.length()) {
            return false;
        }

        char[] s1 = string1.toCharArray();
        char[] s2 = string2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }

    public static boolean isAnagram(int i1, int i2) {
        String str1 = String.valueOf(i1);
        String str2 = String.valueOf(i2);

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }

    public static Map<Character, Integer> characterStatistics(String str) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String s = str.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, new Integer(val + 1));
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

    public static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }

    public static int numDecodings(String s) {

        String regex = "\\d+";
        int count = 0;
        int coding = 0;

        if (s.matches(regex)) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if ('0' == c && count >= 100) {
                    return 0;
                }
                count++;
            }
        }
        return coding = count;
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int n = s.length();
        int num = romanMap.get(s.charAt(n - 1));

        for (int i = n - 2; i >= 0; i--) {
            if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
                num += romanMap.get(s.charAt(i));
            } else {
                num -= romanMap.get(s.charAt(i));
            }
        }
        return num;
    }

    public static int[] runningSum(int[] nums) {

        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i == j) {
                    nums[i] = nums[i] + nums[j - 1];
                    array[i] = nums[i];
                } else array[i] = nums[i];
            }
        }
        return array;
    }

    public static int smallestEvenMultiple(int n) {
        int res = 0;

        if (n % 2 == 0) {
            return res = n;
        } else return res = n * 2;
    }

    public static int minimumSum(int num) {

        //int a = Integer.MAX_VALUE;
        StringBuilder s = new StringBuilder();
        System.out.println(num);
        while (num > 0) {
            s.insert(0, num % 10);
            num = num / 10;
        }
        System.out.print(s.toString() + "/");

        return 0;
    }

    public static List<Boolean> kidsWithCandies1(int[] candies, int extraCandies) {

        ArrayList<Boolean> result = new ArrayList<Boolean>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max)
                max = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;

    }

    public static int charCount(char c, String str) {
        int count = 0;
        String tempStr = str.toLowerCase();
        char tempChar = Character.toLowerCase(c);

        for (int i = 0; i < tempStr.length(); i++) {
            if (tempStr.charAt(i) == tempChar) {
                count++;
            }
        }
        return count;
    }

    public int subtractProductAndSum(int n) {
        char[] chars = Character.toChars(n);

        for (int i = 0; i < chars.length; i++) {
            int temp = chars[i];
            System.out.println(temp);
        }
        return 1;
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();
        int temp1 = 0;
        int temp2 = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max)
                max = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            temp1 = candies[i] + extraCandies;
            if (temp1 > temp2) {
                list.add(true);
            } else list.add(false);
            temp2 = temp1;
        }
        return list;
    }

    public static int minPartitions(String n) {
        int[] num = {Integer.parseInt(n)};
        for (int i = 0; i < n.length(); i++) {
            System.out.println("num[i] = " + num[i]);
        }

        return 1;
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] intReturn = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] > nums[j]) {
                    count++;
                    intReturn[i] = count;
                }
                if(j == nums.length - 1){
                    count = 0;
                }
            }
        }
        return intReturn;
    }

    public static double[] fibonachi(int n){
        double[] array = new double[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public static void fibonachi1(int n){
        int fib1 = 0, fib2 = 1, fib3;
        for (int i = 2; i <= n; i++) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        System.out.println("Число Фибоначчи под номером " + n + " равно " + fib2);
    }




}
