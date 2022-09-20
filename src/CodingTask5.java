import java.util.*;

/**
 * Syntax Technologies
 * Group Project 1 Coding Task 5
 *
 * Create a 2D array of integers. Develop a program
 * which will calculate the sum of even and odd numbers
 * for that array.
 *
 * @author Abdul Hashimi
 */

public class CodingTask5
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);

        int[][] numArray = {{4, 9, 22, 31, 60}, {7, 1, 2, 8, 13}};

        int evens = 0;
        int odds = 0;

        for (int row = 0; row < numArray.length; row++)
        {
            for (int column = 0; column < numArray[row].length; column++)
            {
                if(numArray[row][column] % 2 == 0)
                {
                    evens = evens + numArray[row][column];
                }
                else
                {
                    odds = odds + numArray[row][column];
                }
            }
        }

        System.out.println("Sum of all even numbers is equal to: " + evens + "\n");
        System.out.println("Sum of all odd numbers is equal to: " + odds + "\n");


    }
}
