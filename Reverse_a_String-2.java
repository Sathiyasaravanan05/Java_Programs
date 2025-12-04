import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int len = str.length();
        for(int i= len-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}