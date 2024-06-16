import java.util.Scanner;

public class D_UserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Email Address : ");
        String str = sc.next();

        int i = str.indexOf("@");

        System.out.println(str.substring(0,i));
    }
}
