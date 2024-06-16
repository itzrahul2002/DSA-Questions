import java.util.Scanner;

public class D_StringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = sc.nextLine();

        String str2 = str.replaceAll("a","o");

        System.out.println(str2);
    }
}
