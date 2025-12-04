import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String str = input.next();
       int LP=0;
       int RP=0;
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='('){
               LP++;
           }
           if(str.charAt(i)==')'){
               RP++;
           }
       }
       if(LP==RP){
           System.out.print("yes");
       }else{
           System.out.print("no");
       }
    }
}