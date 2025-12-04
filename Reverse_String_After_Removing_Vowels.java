import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String vowels = "aeiouAEIOU";
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            boolean isVowel = false;
            for (int j = 0; j < vowels.length(); j++) {
                if (str.charAt(i) == vowels.charAt(j)) {
                    isVowel = true; // found a vowel
                    break;
                }
            }
            if (!isVowel) {
                temp.append(str.charAt(i)); 
            }
        }

        if (temp.length() == 0) {
            System.out.print("-1"); 
        } else {
            temp.reverse(); 
            System.out.print(temp.toString());
        }
    }
}
