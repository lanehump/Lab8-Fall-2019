
/**
 * Write a description of class DiceGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class DiceGame{
    public static boolean gameOne(){
        Random gen = new Random();
        for(int i = 0; i < 4; i++){
            int roll = (1 + gen.nextInt(6));
            if (roll == 6){
                return true;
            }
        }
        return false;
    }
    public static boolean gameTwo(){
        Random gen = new Random();
        for(int i = 0; i < 24; i++){
            int roll1 = (1 + gen.nextInt(6));
            int roll2 = (1 + gen.nextInt(6));
            if (roll1 == 6 && roll2 == 6){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int wins1 = 0;
        int losses1 = 0;
        int wins2 = 0;
        int losses2 = 0;
        for(int games = 0; games < 1000000; games++){
            if(gameOne() == true){
                wins1++;
            }
            else{
                losses1++;
            }
        }
        for(int games = 0; games < 1000000; games++){
            if(gameTwo() == true){
                wins2++;
            }
            else{
                losses2++;
            }
        }
        System.out.println("In the first game you will roll a die four times");
        System.out.println("If there is a 6 you win");
        System.out.println("Out of 1 million games you will win " + wins1 + " times");
        System.out.println("This means if each game was worth $1 you'd win $" + wins1);
        System.out.println("and lose $" + losses1);
        System.out.println("----------------------------------------------------------");
        System.out.println("In the second game you roll a pair fo die 24 times");
        System.out.println("If you roll a double 6 it counts as a win");
        System.out.println("Out of a million games you win " + wins2 + " times");
        System.out.println("This means if each game was worth $1 you'd win $" + wins2);
        System.out.println("and lose $" + losses2);
    }
}