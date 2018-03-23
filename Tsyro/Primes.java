import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Primes {


    /**
     * Поиск списка простых чискл от 2 до n по алгоритму "Решето Эратосфена".
     * @param n Число, до которого будет производиться поиск.
     * @return Упорядоченный по возрастанию список простыл чисел от 2 до n включительно.
     */
    public static List<Integer> allPrimes(int n) {
        boolean[] numbers = new boolean[n + 1];
        Arrays.fill(numbers, true);

        for(int i = 2; i*i <= n; i++) {

            if(numbers[i]) {
                for(int j = i*i; j <= n; j += i) {
                    numbers[j] = false;
                }
            }

        }

        List<Integer> primes = new ArrayList<>();
        for(int i = 2; i < numbers.length; i++) {
            if(numbers[i])
                primes.add(i);
        }

        return primes;
    }


    /**
     * Функция определяет, является ли введенное число простым.
     */
    public static boolean isPrime(int n) {
        
        for(int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }

        return true;
    }


    public static void main(String[] args) {

        System.out.println(allPrimes(10));
        System.out.println(allPrimes(31));

        System.out.println("2 is prime: " + isPrime(2));
        System.out.println("7 is prime: " + isPrime(7));
        System.out.println("8 is prime: " + isPrime(8));
        System.out.println("101 is prime: " + isPrime(101));
        
    }

}
