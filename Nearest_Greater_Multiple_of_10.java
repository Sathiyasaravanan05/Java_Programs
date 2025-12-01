import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int result = num/10;
        result++;
        int Gnum=result*10;
        System.out.print(Gnum);
      
    }
}