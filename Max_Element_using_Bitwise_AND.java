import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            int difference = max-arr[i];
            int sign = difference >> 31;
             max = max - (difference&sign);
        }
        System.out.print(max);
    }
}