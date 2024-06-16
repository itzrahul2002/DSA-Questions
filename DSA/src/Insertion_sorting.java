import java.util.Scanner;

public class Insertion_sorting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int arr[] =new int[x];
        for(int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<arr.length;i++) {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        p_arr(arr);
    }

    public static void p_arr(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
