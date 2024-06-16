public class Array_2D {
    public static void main(String[] args) {
        int arr[][] = new int[5][6];
        arr[2][2] = 44;

        System.out.println(arr[2][2]);

        // row no count
        System.out.println(arr.length);
        // col no count
        System.out.println(arr[0].length);

        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
        }
    }
}
