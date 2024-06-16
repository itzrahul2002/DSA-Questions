import java.util.Scanner;

public class GCD_1 {
    public static int euclidGCD(int x, int y){
        int res =0;
        while (x!=y){
//            res=Math.max(x,y);
//            res-=Math.min(x,y);
           if(x>y)
               x-=y;
           else
               y-=x;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println(euclidGCD(x,y));
    }
}
