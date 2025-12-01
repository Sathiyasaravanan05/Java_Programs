import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result=0;
        while(num>0){
            result=result+num;
            num--;
        }
        System.out.print(result);
    }
}