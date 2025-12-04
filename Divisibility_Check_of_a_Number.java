import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count=0;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                count=1;
            }
        }
        if(count==1){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}