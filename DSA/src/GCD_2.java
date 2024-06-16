import java.util.Scanner;
public class GCD_2 {
     static int gabrileGCD(int x, int y){
        while (x!=0 && y!=0){
            if(x>y) x%=y;
            else y%=y;
        }
        if (x!=0) return x;
        else return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println(gabrileGCD(x,y));
    }
}
