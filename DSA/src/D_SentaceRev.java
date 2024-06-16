import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D_SentaceRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev="";

//        for(int i = str.length()-1;i>=0; i--) {
//            if(str.charAt(i)=='.'){
//                int s = str.indexOf('.');
//                rev = rev.substring(s,str.length());
//                rev=rev.substring(i,str.length()-1);
//            }
//        }
//        System.out.println(rev);

        ArrayList<String> arl = new ArrayList<String>();

        str.split(".");


//        String s[] = "i.like.coding".split(".");
//        for (int i=s.length-1; i>=0; i--){
//            rev+=s[i];
//        }
//        System.out.println(
//                rev.substring(0, rev.length() - 1));


        String s[]
                = "i like program".split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--) {
            ans += s[i] + " ";
        }

        System.out.println(
                ans.substring(0, ans.length() - 1));

    }
}
