// WAP to sum the two value in java

import java.util.Scanner;
public class input {
    public static void main(String[] args) {

        int num1, num2 ,sum;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1=sc.nextInt();
        System.out.println("Enter the second  number:");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("Sum of the two number was:"+sum);
        sc.close();
    }
}
