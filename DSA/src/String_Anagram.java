import java.util.Arrays;
import java.util.Scanner;

public class String_Anagram {
    public static void main(String[] args) {
        String inputString = "java";
        char tempArray[] = inputString.toCharArray();

        Arrays.sort(tempArray);
        System.out.println("The Sorted String : " + Arrays.toString(tempArray));


    }
}
