import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();
        int B = input.nextInt();
        int H = input.nextInt();
        int totalSurface = 2*((L*B)+(B*H)+(H*L));
        int volume = L*B*H;
        System.out.print(totalSurface+" "+volume);
        
    }
}