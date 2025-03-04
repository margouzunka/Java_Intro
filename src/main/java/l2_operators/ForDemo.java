package l2_operators;

public class ForDemo {
    public static void main(String[] args) {
        double num, squareRoot, roundError;
        for (num = 1.0; num < 100.0; num++) {
            squareRoot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is equal to " + squareRoot);
            roundError = num - (squareRoot * squareRoot);
            System.out.println("Rounding error is " + roundError);
            System.out.println();
        }

    }
}
