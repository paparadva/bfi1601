public class Primes {
    public static void main (String[] argsl) {
        System.out.println("All primes < 100");
        for (int i = 0; i < 100 ; i++)
            if (IsPrime(i)) System.out.println(i);
    }
    public static boolean IsPrime(int n){
        if (n<=1) return false;
        for (int i = 2; i < n ; i++ )
            if (n%i == 0) return false;
        return true;
    }
}
