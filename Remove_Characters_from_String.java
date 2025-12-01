import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        
        Set<Character> set = new HashSet<>();
        for (char c : s2.toCharArray()) set.add(c);
        
        StringBuilder sb = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (!set.contains(c)) sb.append(c);
        }
        
        if (sb.length() == 0) System.out.print("-1");
        else System.out.print(sb.toString());
    }
}
