/*Write a Java program that converts a decimal number to its binary representation. The program should:

Take an integer input from the user.
Convert the decimal number to binary using the division-by-2 method.
Print the binary equivalent of the decimal number without using any built-in binary conversion methods.*/

import java.util.Scanner;

public class DectoBin {
    public static void decTobin(int number){
        int pow=0;
        int binNum=0;
        while(number>0){
            int rem=number%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            number=number/2;
        }
        System.out.println(binNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Decimal number:");
        int number=sc.nextInt();
        System.out.println("Binary number of "+number+"Decimal Number is ");
        decTobin(number);
    }
}
