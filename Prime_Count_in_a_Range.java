import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();
        int R = input.nextInt();
        int count=0;
        for(int num = L ;num<=R;num++ ){
            if(num<2)continue;
            
            int flag=0;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                count++;
            }
        }
        System.out.print(count);
    }
}