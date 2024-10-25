// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MathUtill {
    // 5 static methods
    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int ca = b;
            b = a % b;
            a = ca;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int va = a + b;
            a = b;
            b = va;
        }
        return b;
    }
    public static int factorial(int n) {
        int me = 1;
        for (int i = 1; i <= n; i++) {
            me *= i;
        }
        return me;
    }
    // 4 non-static methods
    public boolean isPerfect(int n) {
        if (n <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public int reverseNumber(int n) {
        int te = 0;
        while (n > 0) {
            int qe = n % 10;
            te = te * 10 + qe;
            n /= 10;
        }
        return te;
    }
    public int nextPrime(int n) {
        int ca = n + 1;
        while (!isPrime(ca)) {
            ca++;
        }
        return ca;
    }
}
