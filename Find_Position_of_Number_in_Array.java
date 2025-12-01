import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int target=input.nextInt();
        int[]arr=new int[num];
        int size=arr.length;
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        int flag=0;
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                flag=i;
                break;
            }
        }
        if(flag>0){
            System.out.print(flag+1);
        }else{
            System.out.print("-1");
        }
    }
}