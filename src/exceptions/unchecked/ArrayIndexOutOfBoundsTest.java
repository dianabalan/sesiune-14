package exceptions.unchecked;

public class ArrayIndexOutOfBoundsTest {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Before array iteration");

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("After array iteration");
    }
}
