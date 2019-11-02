
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
        System.out.println("Please input the limit of even integers to add.");
        one.sumEven(sc.nextInt());
        System.out.println("Your sum is " + one.getSum());
        one.clearSum();
        
        System.out.println("Please input the limit of integer's squares sum you'd like to see.");
        one.sumSquare(sc.nextInt());
        System.out.println("Your sum is " + one.getSum());
        one.clearSum();
        
        System.out.println("Please input the exponential limit for the sum of 2's you'd like to see");
        one.sumPow(sc.nextInt());
        System.out.println("Your sum is " + one.getSum());
        one.clearSum();
        
        System.out.println("Please input the lower limit and higher limit of odd numbers you'd like to add");
        one.sumOddNumbers(sc.nextInt(), sc.nextInt());
        System.out.println("Your sum is " + one.getSum());
        one.clearSum();
        
        System.out.println("Please input a string of digits and i'll add the odd ones.");
        one.sumOddDigits(sc.next());
        System.out.println("Your sum is " + one.getSum());
        one.clearSum();
    }
}
