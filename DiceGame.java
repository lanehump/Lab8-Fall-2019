
/**
 * Write a description of class DiceGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class DiceGame
{
    private Random generator;
    private int sides;
    public DiceGame(int s){
        sides = s;
        generator = new Random();
    }
    public int cast(){
        return 1 + generator.nextInt(sides);
    }
    public static void main(String[]args){
        DiceGame test = new DiceGame(6);
        int wins = 0;
        int games = 0;
        while(games < 1000000){
            for(int i = 0; i < 4; i++){
                String values = "";
                values += test.cast();
                if(values.contains("6")){
                    wins = wins + 1;
                }
                }
            games += 1;
            }
            System.out.println("Out of a million games you win " + wins + " times");
        }
    }

