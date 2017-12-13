package randomnumbers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 *
 * @author agatajelen CSD 141 Fall 2017 
 */
public class RandomNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First, get a valid filename
        FileOutputStream f = null;
        do {
            System.out.println("Please enter the name of the output file:");
            String filename = sc.next();
            try {
                f = new FileOutputStream(filename);
            } catch(FileNotFoundException e) {
                System.err.println(e.getMessage());
            }
        } while(f == null);

        // Now, get valid input for the valid range of random numbers
        int i1=-1, i2=-1;
        do {
            System.out.println("Please enter two different positive integers for the range of random numbers to generate:");
            try {
                i1 = sc.nextInt();
                i2 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(sc.next() + " is not a positive integer");
                continue;
            }
            if(i1 < 0 || i2 < 0) System.out.println("Numbers should not be negative");
            if(i1 == i2) System.out.println("Numbers should be different");
        } while(i1 <= 0 || i2 <= 0);

        // Because the inputs are not ordered, use min() and max() to make sure we pass the smaller one
        // for the lower bound, and the bigger one for the upper bound
        try (PrintWriter output = new PrintWriter(f)) {
            // Because the inputs are not ordered, use min() and max() to make sure we pass the smaller one
            // for the lower bound, and the bigger one for the upper bound
            IntStream s = new Random().ints(100, min(i1, i2), max(i1, i2));
            for(int i : s.toArray()) {
                output.println(i);
            }
        }
    }
}