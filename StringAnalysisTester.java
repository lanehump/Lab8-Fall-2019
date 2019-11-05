
/**
 * Write a description of class StringAnalysisTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StringAnalysisTester
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a string where you'd like to see the uppercase letters");
        String one = sc.nextLine();
        System.out.print("The uppercase letters in this string are: ");
        System.out.println(StringAnalysis.printUppercase(one));
        
        System.out.println("Pleas input the string that you'd like to see every other character");
        String two = sc.nextLine();
        System.out.print("Every other character is ");
        System.out.println(StringAnalysis.printAlternate(two));
        
        System.out.println("Please enter the string you'd like to see with no vowels");
        String three = sc.nextLine();
        System.out.print("Your string with no vowels is ");
        System.out.println(StringAnalysis.printNoVowel(three));
        
        System.out.println("Please enter the string you'd like to see the number of vowels");
        String four = sc.nextLine();
        System.out.print("The number of vowels in your string: ");
        System.out.println(StringAnalysis.printNumVowel(four));
        
        System.out.println("Please enter the string you'd like to see the position of each vowel");
        String five = sc.nextLine();
        System.out.println(StringAnalysis.printPosVowel(five));
    }
}
