import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                System.out.print(str.charAt(i));
            }
        }
    }
}