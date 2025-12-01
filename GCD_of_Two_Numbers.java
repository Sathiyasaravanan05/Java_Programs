import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 =  input.nextInt();
        num1=Math.abs(num1);
        num2=Math.abs(num2);
        int GCD=0;
        int max,min;
        if(num1>num2){
            max=num1;
        }else{
            max=num2;
        }
        if(num1 >0 && num2>0){
        for(int i=1;i<=max;i++){
            if(num1%i==0 && num2%i==0){
                GCD=i;
            }
        }
        System.out.print(GCD);
        }else{
            System.out.print("-1");
        }
    }
}