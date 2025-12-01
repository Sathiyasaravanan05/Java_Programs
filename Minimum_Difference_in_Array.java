import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num = input.nextInt();
       int[]arr=new int[num];
       int size=arr.length;
       for(int i=0;i<size;i++){
           arr[i]=input.nextInt();
       }
       for(int i=0;i<size-1;i++){
           for(int j=0;j<size-1-i;j++){
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
       int min = Integer.MAX_VALUE;
       for(int i=0;i<size-1;i++){
           int diff=arr[i+1]-arr[i];
           if(diff<min){
               min=diff;
           }
       }
       
       System.out.print(min);
    }
}