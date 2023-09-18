package Problem_50;
import mathLib.ExtraMath;

public class Main {
    public static void main(String[] args){
        int currentPrime = 2;
        int highestSum = 0;
        int mostPrimes = 0;
        for (int i = 0; i < 200_000; i++){
            currentPrime = ExtraMath.nextPrime(currentPrime);
            int sum = 0;
            int consecutiveCount = 1;
            while (sum < 1_000_000){
                consecutiveCount++;
                sum = ExtraMath.consecutivePrimeSum(currentPrime, consecutiveCount);
                if (ExtraMath.isPrime(sum) && consecutiveCount > mostPrimes){
                    highestSum = sum;
                    mostPrimes = consecutiveCount;
                }
            }
        }
        System.out.println(highestSum);
    }
}