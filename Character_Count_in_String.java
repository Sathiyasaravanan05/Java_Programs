import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        char K = input.next().charAt(0);
        int count=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==K){
                count++;
            }
        }
        if(count>0){
            System.out.print(count);
        }else{
            System.out.print("-1");
        }
    }
}