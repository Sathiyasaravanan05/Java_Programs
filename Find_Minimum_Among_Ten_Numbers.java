import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=input.nextInt();
        }
        int temp;
        for(int i=0;i<10-1;i++){
            for(int j = i+1;j<10-1;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print(arr[0]);
    }
}