import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] ={786,333,999,555,888};
        arr[2]=420;

        System.out.println(arr[2]);
        System.out.println(arr.length);

        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<5;i++){
            System.out.println(arr[i]);
        }

    }
}
