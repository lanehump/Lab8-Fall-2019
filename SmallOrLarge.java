
/**
 * Will return back the max and min of a set of user input integers.
 *
 * @author (Lane Humphreys)
 * @version (10/31/19)
 */
import java.util.Scanner;
public class SmallOrLarge
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number;
        int smallest = 0;
        int largest = 0;
        System.out.println("Please enter a set of integers: ");
        System.out.println("Enter -200 to finish");
        System.out.println();
        number = sc.nextInt();
        while(number != -200){
            if(number > largest){
                largest = number;
            }
            if(number < smallest){
                smallest = number;
            }
            number = sc.nextInt();
        }
        System.out.println("The min was: " + smallest + " The max was:  " + largest);
    }
}
