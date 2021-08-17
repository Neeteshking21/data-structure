package Myrecursion;

public class StringSubSequence {
    public static void main(String[] args) {
        sequence("abc", 0,"");
    }
    static void sequence(String str, int i, String ans){
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }

        // nhi lene waala
        sequence(str, i+1, ans);

        // lene waala
        ans = ans+Character.toString(str.charAt(i));        
        sequence(str, i+1, ans);
    }
}
