import java.util.Scanner;
public class LargestSmallest{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);  
    System.out.print("Enter numbers of choice: ");
    int number = input.nextInt();
    int largestNumber = number;
    int smallestNumber = number;
    while(number != 0){
    System.out.print("Enter numbers of choice: ");
    number = input.nextInt(); 
    if(number == 0){
    break;
    }
    if(number > largestNumber){
        largestNumber = number;
    }   
    if(number < smallestNumber){
        smallestNumber = number;
    }
    }
    
    System.out.printf("The smallest is %d and the largest is %d ",smallestNumber,largestNumber);



}
}
