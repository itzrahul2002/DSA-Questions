public class CountDigit {
    public static int CountDi(int x){
        int count=0;
        while (x>0){
            x/=10;
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(CountDi(9332));
    }
}
