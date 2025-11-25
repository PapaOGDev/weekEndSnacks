import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        int result =0;
        boolean prime = true;
        if(number > 0){
            for(int counter=2;counter<=number/2; counter++){
                result = number%counter;
            if(result == 0){
                       prime = false;
                       break;
                    }
            }
            if(prime){
            System.out.print("This number is prime");
            }else{
            System.out.print("This number is not a prie");
            }           
        }
    }
}
