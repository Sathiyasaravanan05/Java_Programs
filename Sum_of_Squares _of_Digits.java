import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int digit=0,sum=0;
        while(n>0){
            digit=n%10;
            
            sum=(digit*digit)+sum;
            n=n/10;
        }
        System.out.print(sum);
    }
}