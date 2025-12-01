import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int d = input.nextInt();
        int n = input.nextInt();
        int sum= (n * (2*a + (n-1)*d)) / 2;
        System.out.print(sum);
        
    }
}