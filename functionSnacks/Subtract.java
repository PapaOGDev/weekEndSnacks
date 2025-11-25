public class Kata{

    public boolean isEven(int number){
            if(number % 2 == 0){
               return true;
            }else{
                return false;    
            }
    }

    public boolean IsPrimeNumber(int number){
        boolean isPrime = true;
        for(divisor=1; divisor<=number/2; divisor++){
            if(number%divisor==0){
                isPrime = false;
                break;
            }else{
                isPrime = true;
            }
        }
        return isPrime;
    }

    public int subtract(int numberOne,int numberTwo){
        int result;
        if(numberOne > numberTwo){
            result = numberOne - numberTwo;
        }else{
            result = numberTwo - numberOne;
        }
        return result;
    }

    public double divide(int dividend,int divisor){
        if(divisor == 0){
            return 0;
        }else{
            int result = dividend / divisor;
            return result;
        }
        
    }
    
    public int factorOf(int number){
    
        for(divisor=1;divisor>=number/2;number++){
            if(number % divisor == 0){
                return divisor;
                }
            }
    }

}
