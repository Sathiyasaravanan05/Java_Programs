import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result=1;
        if(num>0){
            for(int i=num;i>=1;i--){
                result=result*i;
            }
        }
        System.out.print(result);
    }
}