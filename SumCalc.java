
/**
 * Write a description of class SumCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumCalc
{
    public double sum;
    /**
     * Constructs the object that stores the sum
     */
    public SumCalc(){
        sum = sum;
    }
    /**
     * Calculates the sum of all even numbers between 0 and the given limit
     * @param limit int for higher limit
     */
    public void sumEven(int limit){
        if (limit % 2 == 0){
            while(limit >= 2){
                sum = sum + limit;
                limit = limit - 2;
            }
        }
        else{
            limit = limit - 1;
            while(limit >= 2){
                sum = sum + limit;
                limit = limit - 2;
            }
        }
    }
    /**
     * Takes the sum of squares between 0 and a given limit
     * @param limit int that is the highest number you want in the sum
     */
    public void sumSquare(int limit){
        while(limit >= 1){
            sum = sum + (Math.pow(limit, 2));
            limit = limit - 1;
        }
    }
    /**
     * Takes the sum of 2 to every power within a given limit
     * @param limit int for exponential limit
     */
    public void sumPow(int limit){
        while(limit >= 1){
            sum = sum + (Math.pow(2, limit));
            limit = limit - 1;
        }
    }
    /**
     * Calculates the sum of odd numbers between a lower limit and higher limit
     * @param lowLimit int for lower limit
     * @param highLimit int for higher limit
     */
    public void sumOddNumbers(int lowLimit, int highLimit){
        if(highLimit % 2 != 0){
            while(highLimit >= lowLimit){
                sum = sum + highLimit;
                highLimit = highLimit - 2;
            }
        }
    }
    /**
     * Takes the sum of all odd numbers in a given String
     * @param Numbers String of user supplied integers
     */
    public void sumOddDigits(String Numbers){
        for (int i = 0; i < Numbers.length(); i++){
            char c = Numbers.charAt(i);
            if((c - '0') % 2 == 1){
                sum = sum + (c - '0');
            }
        }
    }
    public double getSum(){
        return sum;
    }
    public void clearSum(){
        sum = 0;
    }
}
