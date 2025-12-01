import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N=input.nextInt();
        int L=input.nextInt();
        int R=input.nextInt();
        int count=0;
        for(int i=L+1;i<R;i++){
            if(i==N){
                count=1;
                break;
            }
        }
        if(count==1){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}