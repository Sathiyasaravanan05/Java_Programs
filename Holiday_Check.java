import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String days = input.next();
        String days_lower = days.toLowerCase();
        String[] working_days={"monday","tuesday","wednesday","thursday","friday"};
        int flag=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(days_lower.equals(working_days[j])){
                    flag=1;
                }
            }
        }
        if(flag==1){
            System.out.print("no");
        }else{
            System.out.print("yes");
        }
    }
}