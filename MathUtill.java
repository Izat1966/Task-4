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
}
