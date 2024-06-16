import java.util.Scanner;

public class Single_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char c = sc.next().charAt(0);

        System.out.println("Character : " + c);
    }
}
