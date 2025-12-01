import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num%13==0){
            System.out.print("yes");
        }else{
             System.out.print("no");
        }
    }
}