import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String N = input.next().toUpperCase();
        int result = RomanToInteger(N);
        System.out.print(result);
    }
    
    static int RomanToInteger(String N){
        int sum = 0;
        int prev = 0;
        
        for(int i = 0; i < N.length(); i++){
            char c = N.charAt(i);
            int value = 0;
            
            if(c == 'I') value = 1;
            else if (c == 'V') value = 5;
            else if (c == 'X') value = 10;
            else if (c == 'L') value = 50;
            else if (c == 'C') value = 100;
            else return -1;
            
            // FIX: handle first character
            if(prev == 0){
                sum += value;
            }
            else if(prev < value){
                if ((prev == 1 && (value == 5 || value == 10)) ||
                    (prev == 10 && (value == 50 || value == 100))){
                    sum += value - 2 * prev;
                } else {
                    return -1;
                }
            }
            else{
                sum += value;
            }
            
            prev = value;
        }
        
        return sum;
    }
}
