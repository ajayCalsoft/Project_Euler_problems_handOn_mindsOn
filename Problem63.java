
import java.math.BigInteger;

class Problem63 {
    public static void main(String[] args) {
        System.out.println("No of counts are: " + totalSuchNumbers());
    }

    private static int countDigits(BigInteger number) {
        return number.toString().length();
    }

    private static int totalSuchNumbers() {
        int count = 0;
        for (int k = 1; k <= 9; k++) {
            int n = 1;
            while (true) {
                BigInteger power = BigInteger.valueOf(k).pow(n);
                int digits = countDigits(power);
                if (digits == n) {
                    count++;
                } else {
                    break;
                }
                n++;
            }
        }
        return count;
    }
}





























