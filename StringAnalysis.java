
/**
 * A set of methods to analyze strings.
 *
 * @author (Lane Humphreys)
 * @version (11/01/19)
 */
public class StringAnalysis
{
    public static String printUppercase(String str){
        String uppercase = "";
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                uppercase = uppercase + c + " ";
            }
        }
        return uppercase;
    }
    public static String printAlternate(String str){
        String everyOther = "";
        for (int i = 0; i < str.length(); i = i + 2){
            char c = str.charAt(i);
            everyOther = everyOther + c + " ";
        }
        return everyOther;
    }
    public static String printNoVowel(String str){
        String noVowels = "";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' ||
             c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                noVowels = noVowels + "_";
            }
            else{
                noVowels = noVowels + c;
            }
        }
        return noVowels;
    }
    public static String printNumVowel(String str){
        int numVowels = 0;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' ||
             c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                 numVowels++;
                }
        }
        return "There are " + numVowels + " vowels";
    }
    public static String printPosVowel(String str){
        String vowelPos = "";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' ||
             c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                 vowelPos = vowelPos + i + ", ";
                }
        }
        return "Vowel at positions " + vowelPos;
    }
}
