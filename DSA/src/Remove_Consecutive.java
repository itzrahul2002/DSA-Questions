import java.util.Scanner;

public class Remove_Consecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str="";
        for(int i = 0; i <a.length(); i++) {
            char c = a.charAt(i);
            if(c==c+1){
                str += c;
            }
            System.out.print(str);
        }
    }
}
