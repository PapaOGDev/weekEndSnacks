import java.util.Scanner;

public class NumberToPower{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        double secondNumber = input.nextInt();
        double base = 1;
        for(int counter = 1; counter<=secondNumber; counter++){
         base*=firstNumber;
        }
        System.out.printf("result: %f%n", base);
    }
}
