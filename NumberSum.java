import java.util.Scanner;

public class NumberSum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float sumResult = 0;
        float counter = 0;
        do{
        System.out.print("Enter the first number: ");
        float firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        float secondNumber = input.nextInt();
        sumResult = firstNumber + secondNumber;
        System.out.printf("The sum is %f%n", sumResult);
        System.out.print("Do you want to continue?(yes - 1/no - any other digit): ");
        int answer = input.nextInt();
        if(answer == 1){
            counter++;
        }else{
            counter = 00;
        }
        }while(counter != 00);
    }
}
