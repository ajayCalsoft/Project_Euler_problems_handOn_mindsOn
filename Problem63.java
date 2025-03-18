//7^1 = 7
//7^2 = 49
//7^3 = 343
//7^4 = 2401
//7^5 = 16,807
//7^6 = 117,649

//  7 --> 9 --> 3--> 1--> 7...and so on

public class Problem63 {

    public static void main(String[] args) {
        int totalCount = 0;

        for (int k = 1; k <= 9; k++) {
            // Determine the cycle length for the last digit of k^n
            int cycleLength = getCycleLength(k);

            // Iterate over n in the cycle
            for (int n = 1; ; n += cycleLength) {
                // Check if k^n is an n-digit number
                if (isNDigitNumber(k, n)) {
                    totalCount++;
                    // System.out.println("k = " + k + ", n = " + n + ", k^n = " + pow(k, n));
                } else {
                    break;
                }
            }
        }

        System.out.println("Total n-digit numbers that are nth powers: " + totalCount);
    }

    // Function to compute the cycle length for the last digit of k^n
    private static int getCycleLength(int k) {
        switch (k) {
            case 1: return 1; 
            case 5: return 1; 
            case 6: return 1; 
            case 2: case 3: case 7: case 8: return 4; 
            case 4: case 9: return 2; 
            default: return 0;
        }
    }

    // Function to check if k^n is an n-digit number


    private static boolean isNDigitNumber(int k, int n) {

        long num = pow(k,n);
        String strValue=String.valueOf(num);
        int strLength=strValue.length();
        return (strLength==n);
    }

    //alternate implimentation
    //  private static boolean isNDigitNumber2(int k, int n) {
    //     double log10k = Math.log10(k);
    //     double lowerBound = (n - 1) / (double) n;
    //     double upperBound = 1;

    //     return (log10k >= lowerBound && log10k < upperBound);
    // }

    // Function to compute k^n (for demonstration purposes)
    // private static long pow(int k, int n) {
    //     return (long) Math.pow(k, n);
    // }
}
