import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Test_Class {
    void print(String to_print) {
        System.out.println(to_print);
    }

    Double calculate_height_in_feet(Double height_in_inches) {
        return height_in_inches / 12;
    }

    void read_input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your favorite sentence");
        String s = in.nextLine();
        System.out.println("You inputted: "+s);
    }

    void test_for_and_if(int num_of_loops) {
        for (int i = 0; i <= num_of_loops; i++) {
            System.out.println(i);
        }
        if (num_of_loops % 2 == 0) {
            System.out.println("Input is even");
        } else {
            System.out.println("Input is odd");
        }
    }

    void test_read_write_files() {
        try {
            File file = new File("C:\\Users\\admin\\Desktop\\Temp.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Test_Class class1 = new Test_Class();
        class1.print("Hello World");
        Double value = class1.calculate_height_in_feet(72.0);
        System.out.print("Value: ");
        System.out.println(value);
        class1.read_input();
        class1.test_for_and_if(12);
        class1.test_for_and_if(3);
        class1.test_read_write_files();
    }
}
