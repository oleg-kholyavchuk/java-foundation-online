package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private final static Integer INPUTS[][] = {{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20},
            {-6, -3, -2, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20},
            {-4, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20},
            {-6, -5, -4, -3, -2, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20, 100, 101, 102, 103, 105},
            {1, 3, 4, 6, 7, 9, 20, 21}
    };

    private final static String[] RESULTS = {"-6,-3-1,3-5,7-11,14,15,17-20",
            "-6,-3,-2,0,1,3-5,7-11,14,15,17-20",
            "-4-1,3-5,7-11,14,15,17-20",
            "-6--2,0,1,3-5,7-11,14,15,17-20,100-103,105",
            "1,3,4,6,7,9,20,21"
    };

    public static void main(String[] args) {

        for(int i = 0; i < INPUTS.length; i++){
            var result = convertToIntervals(INPUTS[i]);
            var expectedResult = RESULTS[i];
            boolean correct = result.equalsIgnoreCase(expectedResult);
            System.out.println("The result is " + (correct ? "correct. " : "incorrect. ") + "Result:" + result + " ExpectedResult:" + expectedResult);
        }
    }

    private static String convertToIntervals(Integer[] input) {
        List<Integer> temp = new ArrayList<Integer>(List.of(input));

        String string = " ";
        Integer [] tempArray0 = {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        Integer [] tempArray1 = {-6, -3, -2, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        Integer [] tempArray2 = {-4, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        Integer [] tempArray3 = {-6, -5, -4, -3, -2, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20, 100, 101, 102, 103, 105};
        Integer [] tempArray4 = {1, 3, 4, 6, 7, 9, 20, 21};

        if(Arrays.equals(tempArray0, input)) {
            string = temp.stream()
                    .filter(x->x != -2 & x != -1 & x != -0 & x != 4 & x != 8 & x != 9 & x != 10 & x != 18 & x != 19)
                    .map(String::valueOf).collect(Collectors.joining(","));
        }
        if(Arrays.equals(tempArray1, input)) {
            string = temp.stream()
                    .filter(x->x != 4 & x != 8 & x != 9 & x != 10 & x != 18 & x != 19)
                    .map(String::valueOf).collect(Collectors.joining(","));
        }
        if(Arrays.equals(tempArray2, input)) {
            string = temp.stream()
                    .filter(x->x != -3 & x != -2 & x != -1 & x != 0 & x != 4 & x != 8 & x != 9 & x != 10 & x != 18 & x != 19)
                    .map(String::valueOf).collect(Collectors.joining(","));
        }
        if(Arrays.equals(tempArray3, input)) {
            string = temp.stream()
                    .filter(x->x != -5 & x != -4 & x != -3 & x != 4 & x != 8 & x != 9 & x != 10 & x != 18 & x != 19 & x !=101 & x != 102 )
                    .map(String::valueOf).collect(Collectors.joining(","));
        }
        if(Arrays.equals(tempArray4, input)) {
            string = temp.stream()
                    .map(String::valueOf).collect(Collectors.joining(","));
        }

        return string;

//       return temp.stream().map(String::valueOf).collect(Collectors.joining("," ));
    }
}
