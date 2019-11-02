
/**
 * Write a description of class EvenOrOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EvenOrOdd
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int integers;
        int countEven = 0;
        int countOdd = 0;
        System.out.println("Please enter your integers.");
        System.out.println("Enter -1 to stop");
        System.out.println();
        integers = sc.nextInt();
        while(integers != -1){
            if(integers % 2 == 0){
                countEven++;
            }
            else{
                countOdd++;
            }
            integers = sc.nextInt();
        }
        System.out.println("The even count was: " + countEven);
        System.out.println("The odd count was: " + countOdd);
    }
}
