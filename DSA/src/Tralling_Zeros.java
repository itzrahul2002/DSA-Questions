import java.util.Scanner;

public class Tralling_Zeros {
    public static int Zeros(int n){

        int res=0;
        int powOf=5;
        while (n>=powOf){
            res=res+(n/powOf);
            powOf*=5;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(Zeros(n));
    }
}
