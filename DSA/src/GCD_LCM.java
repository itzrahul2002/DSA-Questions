import java.util.Scanner;

public class GCD_LCM {
    static int GCD(int a,int b){
        int min =Math.min(a,b);
        for(int i=min;i>=0;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
    static int LCM(int a,int b){
        int max1 = Math.max(a,b);
        while (true){
            if(max1%a==0 && max1%b==0){
                break;
            }
            max1++;
        }
        return max1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("GCD : "+GCD(a,b));
        System.out.println("LCM : "+LCM(a,b));
    }
}
