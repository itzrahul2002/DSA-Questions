import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger res = new BigInteger("1");

        for(int i=1;i<=n;i++){
            res=res.multiply(BigInteger.valueOf(i));
        }
        System.out.println(res);
    }
}
