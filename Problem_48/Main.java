package Problem_48;

public class Main {
    public static void main(String[] args){
        long lastTen = 0L;
        for (int i = 1; i <= 1000; i++){
            long modNum = i % (long)Math.pow(10, 10);
            long nextNum = (long)Math.pow(modNum, i); // % (long)Math.pow(10, 10);
            
            lastTen += nextNum;
            lastTen %= (long)Math.pow(10, 10);
            System.out.println(i + ": " + lastTen);
        }
        System.out.println(lastTen);
    }
}