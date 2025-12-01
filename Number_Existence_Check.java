import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        int exist=input.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==exist){
                flag=1;
            }
        }
        if(flag==1){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}