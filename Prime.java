import java.util.*;

public class Prime

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n == 2) {
            System.out.println("Prime");
        } else {
            for (int i = 2; i*i<= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }

    }
}