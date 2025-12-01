import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int target = input.nextInt();

        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = input.nextInt();
        }

        int count = 0;

        for(int i = 0; i < num; i++){
            for(int j = i + 1; j < num; j++){
                if(arr[i] + arr[j] == target){
                    count = 1;
                    break;
                }
            }
            if(count == 1){
                break;
            }
        }

        if(count == 1){
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
