import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num = input.nextInt();
       int digit=0;
       int count=0;
       while(num>0){
           digit=num%10;
           count++;
           num/=10;
       }
       System.out.print(count);
    }
}