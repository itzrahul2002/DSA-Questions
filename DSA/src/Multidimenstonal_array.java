import java.util.Scanner;

public class Multidimenstonal_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];
        for(int i=0;i<5;i++)
        {
            for (int j=0;j<5;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        multi(arr);
    }

    public static void multi (int arr[][]) {
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j< arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
