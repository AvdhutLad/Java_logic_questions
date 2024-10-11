// Question : Write a program that reads a set of integers, and then prints the sum of the
// even and odd integers
import java.util.*;

public class Sum_EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int Even_sum=0;
        int odd_sum=0;
        do{
            System.out.println("Enter numbers or '0' to Exit:");
            n=sc.nextInt();
            if(n%2==0){
                Even_sum=Even_sum+n;
            }
            else{
                odd_sum=odd_sum+n;
            }
            
        }while(n!=0);
        System.out.println("Even Numbers Sum:"+Even_sum);
        System.out.println("Odd Numbers Sum:"+odd_sum);
    }
    
}
