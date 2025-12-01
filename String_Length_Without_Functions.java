import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int count =0;
         for (char c : str.toCharArray()) {
            count++;
        }
        System.out.print(count);
    }
}