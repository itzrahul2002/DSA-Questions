public class All_p {
//    static boolean isPrime(int n){
//        for(int i=2;i<n/2;i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }

    static boolean isPrime(int k){
        for(int i=2;i<=k/2;i++){
            if(k%i==0){
                return false;
            }

        }
        return true;

    }
    public static void display(int k)
    {
        int count=0;
        for(int i=2;i<=k;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
//        System.out.println(count);
    }

    public static void main(String[] args) {
//        for (int i=2;i<=13;i++) {
//            if(isPrime(i)){
//                System.out.println(i);
//            }
//        }
        display(13);
    }
}
