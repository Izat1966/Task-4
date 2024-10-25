public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtill.isPrime(9));
        System.out.println(MathUtill.gcd(9, 12));
        System.out.println(MathUtill.lcm(9, 12));
        System.out.println(MathUtill.fibonacci(6));
        System.out.println(MathUtill.factorial(6));
        var mathUtill = new MathUtill();
        System.out.println(mathUtill.isPerfect(6));
        System.out.println(mathUtill.sumOfDigits(1269));
        System.out.println(mathUtill.reverseNumber(1269));
        System.out.println(mathUtill.nextPrime(17));
    }
}
