import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result=1;
        int digit;
        while(num>0){
            digit=num%10;
            result=result*digit;
            num/=10;
        }
        System.out.print(result);
    }
}