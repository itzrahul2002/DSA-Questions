import java.util.ArrayList;
import java.util.Iterator;

public class Prime_remove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(12);
        list.add(13);
        list.add(15);

        removePrimes(list);
        System.out.println(list);
    }

    public static ArrayList<Integer> removePrimes(ArrayList<Integer> A) {
        Iterator<Integer> it = A.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (isPrime(num)) {
                it.remove();
            }
        }
        return A;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}