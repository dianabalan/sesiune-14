package exceptions.filenotfound;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFileTest {

    public static void main(String[] args) {


        try {

            String fileName = "inputtxt";

            validate(fileName);


            Scanner scanner = openFile(fileName);

            System.out.println(scanner.nextLine());
            System.out.println(scanner.nextLine());
            System.out.println(scanner.nextLine());

        } catch (NoSuchElementException e) {
            System.out.println("No more lines!");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    private static void validate(String fileName) throws Exception {
        if (!fileName.contains(".")) {
            throw new Exception("This is not a valid file name! Should contain point. " + fileName);
        }
    }

    private static Scanner openFile(String fileName) throws FileNotFoundException {
        return new Scanner(new File("input1.txt"));
    }
}
