import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num=input.nextInt();
       int rem=0,digit=0;
       int result=0;
       if(num%10!=0){
           while(num>0){
               digit=num%10;
                result=result*10+digit;
                num/=10;
           }
       }
       if(num%10==0){
           rem=num/10;
       }
       while(rem>0){
           digit=rem%10;
           result=result*10+digit;
           rem/=10;
       }
       System.out.print(result);
    }
}