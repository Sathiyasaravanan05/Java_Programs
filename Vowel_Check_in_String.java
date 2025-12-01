import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name=input.nextLine();
        String vowels="aeiouAEIOU";
        int count =0;
        for(int i=0;i<name.length();i++){
            for(int j=0;j<vowels.length();j++){
                if(name.charAt(i)==vowels.charAt(j)){
                    count=1;
                }
            }
        }
        if(count==1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}