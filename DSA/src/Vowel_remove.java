public class Vowel_remove {
    public static void main(String[] args) {
        String st ="Welcome to Java World";
        vowels(st);
    }
    public static void vowels(String st) {
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                continue;
            }
            System.out.print(ch);
        }
    }
}
