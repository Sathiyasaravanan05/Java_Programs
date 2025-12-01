import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine().trim();
        
        StringBuilder result = new StringBuilder();
        
        for (char c : N.toCharArray()) {
            int digit = c - '0';
            if (digit % 2 == 1) {  // check if odd
                result.append(digit).append(" ");
            }
        }
        
        if (result.length() == 0) {
            System.out.println(-1);
        } else {
            // Trim the trailing space and print
            System.out.println(result.toString().trim());
        }
    }
}
