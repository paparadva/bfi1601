public class Palindrome{
	public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
                String s = args[i];
				System.out.print(args[i] + " ");
				isPalindrome(s);
				
		}
	}
    public static String reverseString(String s){
        String s2 = "";
        for (int i = s.length()-1; i >= 0; --i)
            s2 += s.charAt(i);
        return s2;

    }
    public static Boolean isPalindrome(String s) {
        if(s.equals(reverseString(s))){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        return s.equals(reverseString(s));    
    }	
}
