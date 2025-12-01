import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[]arr=new int[num];
        int size=arr.length;
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        int maxFreq=1;
        for(int i=0;i<size;i++){
            int count =1;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxFreq){
                maxFreq=count;
            }
        }
        if(maxFreq==1){
            System.out.print("-1");
        }else{
            System.out.print(maxFreq);
        }
    }
}