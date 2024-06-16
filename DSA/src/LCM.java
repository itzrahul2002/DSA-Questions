import java.util.Scanner;
public class LCM {
    static int FindLCM(int a,int b){
        int max = Math.max(a,b);
        while (true){
            if(max%a==0 && max%b==0){
                break;
            }
            max++;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        System.out.println(FindLCM(a,b));

    }
}
