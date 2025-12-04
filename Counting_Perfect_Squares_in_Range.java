import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();
        int R = input.nextInt();
        int count=0;
        for(int i=L;i<=R;i++){
            int sq=(int)Math.sqrt(i);
            if((sq*sq)==i){
                
                count++;
            }
        }
        if(count==0){
            System.out.print("-1");
        }else{
            System.out.print(count);
        }
        
    }
}