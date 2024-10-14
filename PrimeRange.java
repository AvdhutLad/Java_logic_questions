/*Write a Java program that finds and prints all prime numbers in a given range starting from 2 up to a user-defined number. The program should:

Define a method isPrime(int n) that checks whether a number n is prime. This method should return true if n is prime and false otherwise.
Define another method primeInRange(int number) that prints all prime numbers between 2 and the input number.
In the main() method, prompt the user to input an integer representing the upper bound of the range.
The program should print all prime numbers from 2 up to the input number. */

import java.util.Scanner;

public class PrimeRange {

    public static boolean isPrime(int n){
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
    }

    public static void primeInRange(int number){
        for (int i=2;i<=number;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Range End:");
        int number=sc.nextInt();
        System.out.println(" Prime numbers in 1 to "+number+":");
        primeInRange(number);
        
    }
}
