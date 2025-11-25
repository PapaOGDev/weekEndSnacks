import java.util.Scanner;

public class HighestAndLowestNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number(0 to exit): ");
        float firstNumber = input.nextInt();
        System.out.print("Enter a number(0 to exit): ");
        float secondNumber = input.nextInt();
        float highestNumber = firstNumber;
        float smallestNumber = firstNumber;
        int number = (int)firstNumber;
        int counter = 0;
            if(secondNumber > highestNumber){
               smallestNumber = highestNumber;
               highestNumber = secondNumber;
            }else{
               smallestNumber = secondNumber;
            }
                while(number != 0){
                   
           
                        System.out.print("Enter a number(0 to exit): ");
                        number = input.nextInt();
                        if(number > highestNumber && number > smallestNumber){
                            smallestNumber = highestNumber;
                            highestNumber = number;
                        }else if(number < highestNumber && number < smallestNumber){
                            smallestNumber = number;
                        }
                         if(number == 0){
                            System.out.println("Are you sure you want to stop? Press any digit if not '1' to continue: ");
                            int answer = input.nextInt();
                            if(answer == 1){
                                number = 0;
                              }  
                        } 
            
}
                System.out.printf("The largest is %f%n", highestNumber);
                System.out.printf("The smallest is %f%n", smallestNumber);
    }
}
