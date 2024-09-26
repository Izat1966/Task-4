// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MathUtill {

    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
            return true;
    }
    public double add(double a, int b) {
        return a+b;
    }

    public double add(int a, int b, int c) {
        return a+b+c;
    }
}