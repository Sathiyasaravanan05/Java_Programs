import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float L = input.nextFloat();
        float B = input.nextFloat();
        float Area = L*B;
        System.out.printf("%.5f",Area);
        
    }
}