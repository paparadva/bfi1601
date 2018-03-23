// БФИ1601
// Марышев Д
//
public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i<args.length ;i++ ) {
        if (IsPalindrome(args[i]))
	        System.out.println(args[i] + " - palindrome.");
        else
	        System.out.println(args[i] + " - not palindrome.");
        }
    }
  public static boolean IsPalindrome(String string) {
    String reverse = new StringBuffer(string)
        .reverse()
        .toString();
    if (string.equals(reverse)) return true;
    else return false;
    }
}
