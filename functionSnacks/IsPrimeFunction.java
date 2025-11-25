public boolean IsPrimeFunction(int number){
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
