import java.util.Scanner;

public class NumberLine{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int count = 0;
        while(number != 8){
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number > 0){
            positiveCount+=1;
        }else if(number < 0){
            negativeCount+=1;
        }else{
            zeroCount+=1;
        }
        };
        System.out.printf("The positive number is %d,negative number is %d and the number of zeros is %d%n", positiveCount, negativeCount, zeroCount);
    }
}
