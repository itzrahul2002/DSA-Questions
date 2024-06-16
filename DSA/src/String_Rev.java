import java.util.Scanner;

public class String_Rev {
    public static boolean isPalandrom(String s) {
        String rev="";
        for (int i=s.length()-1; i>=0; i--) {
            rev += s.charAt(i);
        }
        if (rev.equals(s))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalandrom(str));
    }
}
