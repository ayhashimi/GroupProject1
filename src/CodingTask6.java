import java.util.*;

/**
 *
 * Syntax Technologies
 * Group Project 1 Coding Task 6
 *
 * Write a program to swap 2 numbers without a
 * temporary variable?
 */

public class CodingTask6
{
    public static void main(String[] args)
    {
        System.out.println("Please provide 2 different numbers: ");

        Scanner scr = new Scanner(System.in);

        int num1 = scr.nextInt();
        int num2 = scr.nextInt();

        while (num2 == num1)
        {
            System.out.println("Please provide a different second number: ");
            num2 = scr.nextInt();
        }

        System.out.println("Before swapping:\nnum1 = " + num1 +"\nnum2 = " + num2 + "\n");

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping: \nnum1 = " + num1 + " \nnum2 = " + num2);

    }
}
