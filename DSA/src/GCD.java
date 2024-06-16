import java.util.Scanner;

public class GCD {
    public static int GCD(int x, int y) {
       int min = Math.min(x, y);
       for (int i=min;i>=0;i--) {
           if (x%i==0 && y%i==0) {
               return i;
           }
       }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println(GCD(x,y));
    }
}
