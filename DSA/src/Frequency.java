import java.util.Arrays;
import java.util.Scanner;

public class Frequency {
    static void getFreq(int arr[]){
        Arrays.sort(arr);
        int freq =1;
        int i=1;
        while (i<arr.length){
            while (i<arr.length && arr[i-1]==arr[i]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+"          "+freq);
            freq = 1;
            i++;
        }
        if(arr[i-1]!=arr[i-2] || arr.length<=1){
            System.out.println(arr[i-1]+"         "+freq);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        getFreq(arr);
    }
}
