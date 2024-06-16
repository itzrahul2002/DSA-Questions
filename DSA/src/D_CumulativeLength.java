import java.util.Scanner;

public class D_CumulativeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        String arr[] = new String[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.next();
        }

        int length = 0;
        for(int i =0;i<n;i++){
            length+=arr[i].length();
        }
        System.out.println(length);
    }
}
