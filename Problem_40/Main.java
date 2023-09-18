package Problem_40;

public class Main {
    public static void main(String[] args){
        int count = 0;
        int num = 1;
        int product = 1;
        int[] digits = {1, 10, 100, 1_000, 10_000, 100_000, 1_000_000};
        int currentIndex = 0;
        while (count < 1_000_000){
            String numString = Integer.toString(num);
            count += numString.length();
            if (count >= digits[currentIndex]){
                product *= Integer.parseInt(numString.substring(numString.length() - (count - digits[currentIndex]) - 1, (numString.length() - (count - digits[currentIndex]))));
                System.out.println(num);
                currentIndex++;
            }
            num++;
        }
        System.out.println(product);
    }
}
