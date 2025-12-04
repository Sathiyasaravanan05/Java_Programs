import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        K = K % N;
        
        int count = 0;

        for(int i = N - K; i < N; i++) {
            if(count > 0) System.out.print(" ");
            System.out.print(arr[i]);
            count++;
        }

        for(int i = 0; i < N - K; i++) {
            if(count > 0) System.out.print(" ");
            System.out.print(arr[i]);
            count++;
        }
    }
}
