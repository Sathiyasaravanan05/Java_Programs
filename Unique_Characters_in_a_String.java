import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int uniqueCount =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int count=0;
            
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==ch){
                    count++;
                }
            }
            if(count==1){
                uniqueCount++;
            }
        }
        if(uniqueCount==0){
            System.out.print("-1");
        }else{
            System.out.print(uniqueCount);
        }
    }
}
