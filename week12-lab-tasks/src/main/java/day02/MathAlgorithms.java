package day02;

public class MathAlgorithms {

    public int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        validateNumber(firstNumber);
        validateNumber(secondNumber);
        int gcd = 1;
        for (int i = 1; i <= firstNumber && i <= secondNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private void validateNumber(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Invalid number");
        }
    }
}
