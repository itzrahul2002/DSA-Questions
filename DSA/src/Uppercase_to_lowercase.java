public class Uppercase_to_lowercase {
    public static void main(String[] args) {
        String str = "WelcOme To DuCaT";
        uppercase(str);
    }
    public static void uppercase(String str) {
        char[] s=str.toCharArray();
        for (int i = 0;i<str.length();i++) {
            char ch = s[i];

            if (ch>='A' && ch<='Z') {
                char ansch=(char)(ch-'A'+'a');
                s[i]=ansch;
            }
        }
        for(char c:s){
            System.out.print(c);
        }
    }
}


