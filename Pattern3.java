// 1
// 12
// 123
// 1234
// 12345
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter line:");
        int line=sc.nextInt();
        for(int i=1;i<=line;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
