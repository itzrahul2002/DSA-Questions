import java.util.Scanner;

public class MAX_MIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {44,55,66,22,88};

//        for (int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<5;i++){
            if(arr[i]>max) {
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum Is : "+max);
        System.out.println("Minimum Is : "+min);
    }
}
