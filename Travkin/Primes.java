     public class Primes 
     {
        public static void main(String[] args) 
        {
            int n=100;
            for (int i=2;i<n;i++)
            {
                if (isPrime(i)==true)
                    System.out.print(i+" ");
            }
        }
          public static boolean isPrime(int n) 
            {
                int c=0;
                  for (int j=1;j<n;j++)
                {   
                    if (n%j==0)
                         c++;   
                } 
                if (c==1)
                    return true;
                else
                    return false;
            }
     }      


