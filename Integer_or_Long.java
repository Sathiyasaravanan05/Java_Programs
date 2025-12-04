import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();

        if(num<=100000){
            System.out.print("INT");
        }else{
            System.out.print("LONG");
        }
    }
}
