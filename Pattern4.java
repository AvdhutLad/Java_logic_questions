// A
// BC
// DEF
// GHIJ
// KLMNO
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Lines:");
        int line=sc.nextInt();
        char ch='A';
        for (int i=1;i<=line;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
