import java.util.Arrays;
public class Kata{

    public static boolean isEven(int number){
            if(number % 2 == 0){
               return true;
            }else{
                return false;
            }
    }

    public static boolean IsPrimeNumber(int number){
        boolean isPrime = true;
        for(int divisor=1; divisor<=number/2; divisor++){
            if(number%divisor==0){
                isPrime = false;
                break;
            }else{
                isPrime = true;
            }
        }
        return isPrime;
    }

    public double subtract(double numberOne,double numberTwo){
        double result;
        if(numberOne > numberTwo){
            result = numberOne - numberTwo;
        }else{
            result = numberTwo - numberOne;
        }
        return result;
    }

    public static float divide(int dividend,int divisor){
        if(divisor == 0){
            return 0;
        }else{
            float result = (float) dividend / (float) divisor;
            return result;
        }
        
    }
    
//    public static String factorOf(int number){
//        int divisor;
//        int sizeOfArray = 1000;
//        int[] factors = new int[sizeOfArray];
//        for(divisor=1;divisor<=number/2;number++){
//    System.out.print(sizeOfArray);
//            if(number % divisor == 0){
//                sizeOfArray+=1; 
//                factors[sizeOfArray] = divisor; 
//                System.out.print(number);   
//                break;      
//                }
//            }
//    return Arrays.toString(factors);
//    }

    public static String factorOf(int number) {
        int[] factors = new int[number];
        int index = 0;

        for (int divisor = 1; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                factors[index] = divisor;
                index++;
            }
        }

        factors[index] = number;
        index++;

        return Arrays.toString(Arrays.copyOf(factors, index));
    }

    public static boolean isSquare(int number) {
        if((Math.sqrt(number) * 10) % 10 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isPalindrome(int number){
        int firstNumber = number/10000;
        int secondNumber = (number/1000) % 10;
        int thirdNumber = (number/100) % 10;
        int fourthNumber = (number/10) % 10;
        int fifthNumber = number % 10;
        
        if(firstNumber == fifthNumber && secondNumber == fourthNumber){
            return true;
        }else{
            return false;
        }
    }

    public static long factorialOf(int number){
        int result=1;
        for(int count = 1; count<=number; count++){
            result*=count;
        }
        return result;
     }

    public static long squareOf(int number){
        int result = number * number;
        return result;
    }

}
