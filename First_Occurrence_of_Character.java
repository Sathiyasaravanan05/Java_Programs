import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        int count=0;
        
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==str2.charAt(0)){
                System.out.print(i+1);
                count=1;
                break;
            }
        }
        if(count==0){
            System.out.print("-1");
        }
        
    }
}