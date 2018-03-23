// Простые числа
public class Primes
{
	// Поиск и вывод простых чисел
	public static void main (String[] args)
	{
		System.out.print("Primes: ");
		for (int i=2;i<=100;i++)
		{
			if (isPrime(i)==true)
				System.out.print(i+"  ");
		}
	}
	// Проверка, является ли число n простым
	public static boolean isPrime(int n)
	{
		for (int i=2;i<n;i++)
		{
			if (n%i==0)
				return false;
		}
		return true;
	}

}