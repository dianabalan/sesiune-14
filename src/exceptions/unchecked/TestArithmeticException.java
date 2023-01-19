package exceptions.unchecked;

public class TestArithmeticException {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        int num3 = num1 / num2;

        System.out.println("After division: " + num3);
    }
}
