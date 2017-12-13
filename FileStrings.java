package filestrings;

import java.util.Scanner;
import java.io.*;

/**
 * @student: Agata Jelen CSD 141 Fall 2017
 *
 * Algorithm Notes: variables are declared and a while loop is added to run the
 * program, user is prompted for file name, if they enter an invalid file name,
 * the program will notify them (with try statement and catch statement like the
 * input validation file [versus throws FileNotFound Exception following the
 * main class declaration]) and give them another opportunity to enter a file
 * name. Sentinel string 'stop' will stop the program. Once the user has
 * successfully opened a valid file, they are prompted for the word that they
 * are looking for (searchWord). A while loop for the duration that the file
 * .hasNext() [word] (to stop it once it reaches the end of the document).
 * Within this loop a reader scans the document and every time the word is
 * contained within the scanned document, the counter increases. This counts the
 * occurrences that the word appears in the document and outputs for to the
 * user. Output also provided if the number of occurrences is 0, for the word
 * not being found in the document.
 *
 */
public class FileStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner keyboard added for user input
        Scanner keyboard = new Scanner(System.in);
        //String searchWord for the word you are indexing
        String searchWord;
        //String fileName for storing user input file name
        String fileName = "";
        //int count added for counter variable
        int count = 0;
        //String sentinel for the keyword stop to exit program
        String sentinel = "stop";
        Scanner inputFile = null;
        //while statement for performing opening file
        while (inputFile == null) {
            //Requesting input from user for the file name or stop to exit
            System.out.println("Enter the filename or enter 'stop' to exit this program: ");
            //fileName stores the user's named file
            fileName = keyboard.next();
            //if statement for if the user decides to quit using the sential (ignoring the case)
            if (fileName.equalsIgnoreCase(sentinel)) {
                //exits the program
                System.exit(0);
            }
            //try statement for opening the file
            try {
                //File myFile declared to open the file for reading the input
                File myFile = new File(fileName);
                //scanner added to read the input of myFile
                inputFile = new Scanner(myFile);
            } catch (FileNotFoundException e) {
                //output for error opening file
                System.out.println(e.getMessage() + ":please try again.\n");
            }
        }
        //Requesting input from user for the word they are looking for
        System.out.println("What word are you looking for within this file: ");
        //string searchWord stores the input from the user
        searchWord = keyboard.next();
        //stored input is trimmed to remove additional whitespace in search
        searchWord = searchWord.trim();

        //While statement for reading the document
        while (inputFile.hasNext()) {
            //String readFile added to reach each word of the document
            String readFile = inputFile.next();
            //if statement for if the document contains the search word
            if (readFile.contains(searchWord)) {
                //counter variable increased by one for each time it is found
                count++;
            }
        }

        //if statement for if nothing was found in the document
        if (count == 0) {
            //output for if the word does not appear in the document
            System.out.printf("The word %s does not appear in this document.\n", searchWord);
        } else {
            //output for if the word appears in the document and count of how many times it appears
            System.out.printf("The word %s appears in the file %s, %d times.", searchWord, fileName, count);
        }
        //exits the program
        System.exit(0);
    }
}
