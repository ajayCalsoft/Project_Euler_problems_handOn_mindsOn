
import java.math.BigInteger;

public class Problem522 {

    private static final long MOD = 135707531;

    // Function to compute n^n mod MOD
    private static long powerMod(long n, long mod) {
        return BigInteger.valueOf(n).modPow(BigInteger.valueOf(n), BigInteger.valueOf(mod)).longValue();
    }

    // Function to compute n! mod MOD
    private static long factorialMod(long n, long mod) {
        long result = 1;
        for (long i = 2; i <= n; i++) {
            result = (result * i) % mod;
        }
        return result;
    }

    public static void main(String[] args) {
        long n = 12344321; 

        long nPowerN = powerMod(n, MOD);

        long nFactorial = factorialMod(n, MOD);

        long F = (nPowerN - nFactorial + MOD) % MOD;

        System.out.println("F(" + n + ") mod " + MOD + " = " + F);
    }
}
