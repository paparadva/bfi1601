public class Palindrome {
    public static String reverseString(String s){
        String s1 = "";
        for (int i = s.length()-1; i>=0; i--)
            s1 += s.charAt(i);
        return(s1);

    }

    public static boolean isPalindrome(String s){
        String s1 = reverseString(s);
        return s.equals(s1);

    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println("Is this a polyndrom?");
            System.out.println(s + " - " + isPalindrome(s));
        }
    }

}