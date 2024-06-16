import java.util.Scanner;

public class Prime_Number_4 {
    static boolean isPrime(int n){
        for (int i =2; i <=n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static void allPrime(int x){
        for (int i =2; i <=x;i++){
            if(isPrime(i)){
                System.out.print(i+"❗ ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        System.out.println((isPrime(n))? "Prime" :"Not A Prime");
        allPrime(n);
    }
}
