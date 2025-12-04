import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angleDegrees = input.nextDouble();

        double angleRadians = Math.toRadians(angleDegrees);

        double sineValue = Math.sin(angleRadians);

        sineValue = Math.round(sineValue * 1_000_000.0) / 1_000_000.0;

        if(sineValue == Math.floor(sineValue)){
            System.out.println((int)sineValue);
        } else {
            System.out.println(sineValue);
        }
    }
}
