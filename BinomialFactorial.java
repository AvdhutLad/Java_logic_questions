import java.util.Scanner;

public class BinomialFactorial {

    public static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static int binomialfactorial(int n, int r)
    {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int factn_n_r=factorial(n-r);
        int result=fact_n/(fact_r*factn_n_r);
        return result;
    }
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();
        System.out.println("Enter R:");
        int r=sc.nextInt();
        int Result=binomialfactorial(n,r);
        System.out.println("Factorial is:"+Result);

    }
}
