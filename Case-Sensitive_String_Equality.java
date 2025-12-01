import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1= input.next();
        String str2=input.next();
        int len1=str1.length();
        int len2=str2.length();
        int count=1;
        if(len1!=len2){
            count=0;
        }else{
            for(int i=0;i<len1;i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                count=0;
                break;
            }
        }
        
        }if(count==1){
        System.out.print("yes");
        }else{
            System.out.print("no");
        }
        
    }
}