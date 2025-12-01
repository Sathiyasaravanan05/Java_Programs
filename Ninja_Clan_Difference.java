import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N1=input.nextInt();
        int N2=input.nextInt();
        if(N1>N2){
            System.out.print(N1-N2);
        }else if(N2>N1){
            System.out.print(N2-N1);
        }
    }
}