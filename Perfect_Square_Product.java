import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int mul = N*M;
        int root = (int)Math.sqrt(mul);
        if(root*root==mul){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}