import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class PhaseThreeStrings {

    //1.print string characters
    static void printCharacters(String s){
        for (int i = 0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }

    //2.Count vowels and constants
    static void countVowelsAndConsonants(String s){
        int vowels = 0;
        int consonants= 0;

        s = s.toLowerCase();
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            if (ch>= 'a' && ch<='z'){
                if (ch =='a' || ch=='e'|| ch == 'i'|| ch== 'o'||ch =='u'){
                    vowels++;

                } else{
                    consonants++;
                }
            }
        }
        System.out.println("vowels: "+ vowels);
        System.out.println("consonents: "+ consonants);
    }

    //3. reverse a string
    static void reverseString(String s){
        String reversed = "";

        for (int i = s.length()-1;i>=0;i--){
            reversed = reversed+ s.charAt(i);
        }

        System.out.println("Reversed string: "+ reversed);
    }

    //4. palindrome
    static void checkPalindrome(String s){
        String original = s.toLowerCase();
        String reversed="";
        for (int i = original.length()-1;i>=0;i--){
            reversed= reversed + original.charAt(i);
        }

        if (original.equals(reversed)){
            System.out.println("Palindrome");
        } else{
            System.out.println("not a palindrome");
        }
    }

    /*
 WHY HashMap is used here:

 - Problem: Count how many times each character appears in a string.
 - We need a way to store:
      key   -> character
      value -> frequency (count)

 - HashMap is ideal when:
      1. We want fast lookup and update
      2. We don't know all possible keys beforehand
      3. Each key should be unique

 - Alternative (array) would be messy because:
      - character values are not limited to small indexes
      - mapping characters to indexes manually is error-prone

 - Pattern to remember:
      - Use HashMap when the question involves:
           "how many times..."
           "frequency of..."
           "count occurrences..."

 - Same idea was used earlier with:
      - array frequency counting
      - duplicate detection logic
*/
    //5. Character frequency
    static void characterFrequency(String s){
        HashMap<Character, Integer> freq = new HashMap<>();

        s= s.toLowerCase();

        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch>='a'&& ch<='z'){
                if (freq.containsKey(ch)){
                    freq.put(ch, freq.get(ch)+1);
                } else{
                    freq.put(ch,1);
                }
            }
        }
        System.out.println("\nCharacter frequency");
        for (char key: freq.keySet()){
            System.out.println(key+ "->"+freq.get(key));
        }
    }

    //main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        printCharacters(input);

        //calling 2nd method
        countVowelsAndConsonants(input);
        //calling 3rd method
        reverseString(input);
        //calling 4th method
        checkPalindrome(input);
        //calling 5th method
        characterFrequency(input);


        sc.close();
    }

}

