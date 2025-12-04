import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                if(i+1<str.length()){
                System.out.print(str.charAt(i+1));}
                else{
                    System.out.print(str.charAt(i));
                }
            }else{
                System.out.print(str.charAt(i-1));
            }
        }
    }
}