import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int K=input.nextInt();
        int[]arr=new int[N];
        int count=0;
      
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(K==arr[i]){
                count++;
            }
        }
        if(count>=1){
        System.out.print(count);}
        else{
            System.out.print("-1");
        }
        
    }
}