
/**
 * Write a description of class SumTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SumTester
{
    public static void main(String[]args){
        SumCalc one = new SumCalc();
        Scanner sc = new Scanner(System.in);
        
        boolean valid = false;
        while(!valid){
            System.out.println("Please input a positive integer between 2 and 100");
            int first = sc.nextInt();
            if(first >= 2 && first <= 100){
                one.sumEven(first);
                System.out.print("The sum of all even numbers between 0 and " + first);
                System.out.println(" is " + one.getSum());
                valid = true;
                one.clearSum();
            }
            else{
                System.out.println("ERROR: Please enter a different input");
            }
        }
        System.out.println();
        boolean valid1 = false;
        while(!valid1){
            System.out.println("Please input a positive limit of squares you'd like to see");
            System.out.println("Must be between 2 amd 100");
            int second = sc.nextInt();
            if(second >= 2 && second <= 100){
                one.sumSquare(second);
                System.out.print("The sum of all squares between 1 and " + second);
                System.out.println(" is " + one.getSum());
                valid1 = true;
                one.clearSum();
            }
            else{
                System.out.println("ERROR: Please input a different value");
            }
        }
        System.out.println();
        boolean valid2 = false;
        while(!valid2){
            System.out.println("Please enter the limit for 2 to x power");
            System.out.println("IE entering 7 would yield all sums of 2 to the first through 2 to the seventh");
            System.out.println("must be between 1 and 20");
            int third = sc.nextInt();
            if (third >= 1 && third <= 20){
                one.sumPow(third);
                System.out.println("The sum of 2 to " + third + " power is " + one.getSum());
                valid2 = true;
                one.clearSum();
            }
            else{
                System.out.println("ERROR: Please input a different value");
            }
        }
        System.out.println();
        boolean valid3 = false;
        while(!valid3){
            System.out.println("Please enter a lower limit and a higher limit");
            System.out.println("Lower limit: greater than 0");
            System.out.println("Higher limit: less than 100");
            int lowLimit = sc.nextInt();
            int highLimit = sc.nextInt();
            if(lowLimit > 0 && highLimit <= 100){
                one.sumOddNumbers(lowLimit, highLimit);
                System.out.println("The sum of all odd numbers between " + lowLimit + " and " + highLimit + " is " + one.getSum());
                one.clearSum();
                valid3 = true;
            }
            else{
                System.out.println("ERROR: Please input a different value");
            }
        }
        System.out.println();
        boolean valid4 = false;
        while(!valid4){
            System.out.println("Input a string of integers no greater than 9999999");
            int values = sc.nextInt();
            if(values < 9999999 && values > 1){
                String numbers = "" + values;
                one.sumOddDigits(numbers);
                System.out.println("The sum of the odd digits in the string is " + one.getSum());
                one.clearSum();
                valid4 = true;
            }
            else{
                 System.out.println("ERROR: Please input a different value");
            }
        }
    }
}
