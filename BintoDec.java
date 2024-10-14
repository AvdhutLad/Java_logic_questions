/*Write a Java program that converts a binary number (entered as an integer) to its decimal equivalent. The program should:

Prompt the user to input a binary number.
Use a loop to process each digit of the binary number, multiplying each digit (either 0 or 1) by powers of 2 based on its position.
Sum the results to get the decimal equivalent.
Print the decimal equivalent of the input binary number.*/

import java.util.Scanner;

public class BintoDec {
    public static int bintoDec(int binnum){
        int pow=0;
        int decimal=0;
        while(binnum>0){
            int lastDigit=binnum%10;
            decimal=decimal+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binnum=binnum/10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Binary Number:");
        int number=sc.nextInt();
        int DecNum =bintoDec(number);
        System.out.println("Decimal number of binary number "+number+" : "+DecNum);
    }
}
