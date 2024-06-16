import java.util.Scanner;

public class Selection_sorting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int arr[] =new int[x];
        for(int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length-1;i++) {
            int smallest = i;
            for (int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        sorting(arr);
    }

    public static void sorting(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
