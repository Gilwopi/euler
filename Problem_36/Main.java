package Problem_36;

public class Main {
    public static void main(String[] args){
        int total = 0;
        for (int num = 0; num < 1_000_000; num++){
            if (isPal10(num) && isPal2(num)){
                total += num;
            }
        }
        System.out.println(total);
    }
    
    public static boolean isPal10(int num){
        String numString = Integer.toString(num);
        for (int i = 0; i < (int)(numString.length() / 2); i++){
            if (numString.charAt(i) != numString.charAt(numString.length() - (i + 1))){
                return false;
            }
        }
        return true;
    }

    public static boolean isPal2(int num){
        String numString = Integer.toBinaryString(num);
        for (int i = 0; i < (int)(numString.length() / 2); i++){
            if (numString.charAt(i) != numString.charAt(numString.length() - (i + 1))){
                return false;
            }
        }
        return true;
    }
}
