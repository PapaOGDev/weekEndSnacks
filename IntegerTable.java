import java.util.Scanner;

public class IntegerTable{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        for(int number = 1;number<=5;number++){
            
            System.out.printf("%d   %d   %d%n", number, number+1, (int)Math.pow(number,number+1));
        }
        
    }
}
