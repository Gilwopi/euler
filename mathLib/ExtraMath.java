package mathLib;

public class ExtraMath {
    public static boolean isPrime(int num){
        for (int d = 2; d < (int)Math.sqrt(num) + 1; d++){
            if (num % d == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int num){
        if (num % 2 == 0){
            return true;
        }
        return false;
    }

    public static int nextPrime(int num){
        int prime = ++num;
        while (!isPrime(prime)){
            prime++;
        }
        return prime;
    }

    public static int consecutivePrimeSum(int startNum, int count){
        count -= 1;
        int total = startNum;
        int prime = startNum;
        for (int i = 0; i < count; i++){
            prime = nextPrime(prime);
            total += prime;
        }
        return total;
    }
}