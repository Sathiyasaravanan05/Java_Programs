import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int len=str.length();
        for(int i=0;i<len;i++){
            if((i+1)%2!=0){
                System.out.print(str.charAt(i));
            }
        }
        System.out.print(" ");
        for(int i=0;i<len;i++){
            if((i)%2!=0){
                System.out.print(str.charAt(i));
            }
        }
    }
}