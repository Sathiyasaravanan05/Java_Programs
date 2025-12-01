import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int N = input.nextInt();
       int M = input.nextInt();
       N=Math.abs(N);
       M=Math.abs(M);
       int diff=N-M;
       if(diff%2==0){
           System.out.print("even");
       }else{
           System.out.print("odd");
       }
    }
}