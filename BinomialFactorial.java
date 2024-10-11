/*Question:
Write a Java program to calculate the binomial coefficient, which represents the number of ways to choose k elements from a set of n elements. 
The binomial coefficient is given by the formula:
 
Implement a function binomial_coefficient(n, k) that takes two integers n and k as input and returns the binomial coefficient.

Sample Input:
mathematica
Copy code
Enter value of n: 5
Enter value of k: 2
Sample Output:
The binomial coefficient C(5, 2) is: 10
Constraints:
Assume n ≥ k ≥ 0.
Factorial grows very fast, so handle the calculations carefully to avoid overflow for large n.
This question is focused on using combinatorics to calculate the number of combinations possible for a given set of n elements. 

Logic:
The binomial factor is computed as n! / (k! * (n - k)!), where ! denotes the factorial of a number.
*/


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
