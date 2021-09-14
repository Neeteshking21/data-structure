public class palindromeNumber{
    public static void main(String[] args) {
        System.out.println(is_palindrome(5555));
    }
    static String is_palindrome(int n)
    {
        // Code here
        String str = String.valueOf(n);
        // System.out.print(str.charAt(str.length()-1));
        if(is(str, 0, str.length()-1)) return "Yes";
        return "No";
    }
    
    static boolean is(String n, int start, int end){
        if(start < end)
        {
        if(n.charAt(start) == n.charAt(end))
            return is(n, ++start, --end);
        else return false;
        }
        return true;
    }
}