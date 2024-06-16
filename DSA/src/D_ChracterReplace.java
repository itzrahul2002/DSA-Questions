import java.util.Scanner;

public class D_ChracterReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        char r = sc.next().charAt(0);
        String res ="";

        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i)==c){
                res+=r;
            }else {
                res+=str.charAt(i);
            }
        }
        System.out.println(res);

    }
}
