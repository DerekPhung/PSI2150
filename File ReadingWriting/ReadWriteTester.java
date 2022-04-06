import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadWriteTester {
    /**
     * We are going to be making a program that will utilize file reading and
     * writing.
     * First, the program will take in five Animal objects and write them to a .txt
     * file.
     * Afterwards, the program will then read through the file and print its
     * contents.
     */

    /**
     * writeFile
     * 
     * In this method, we are going to write to animals.txt.
     * We will need two different try/catch blocks.
     * The first try block will open the file using java.io.File and
     * java.io.PrintWriter. It
     * will catch errors using FileNotFoundException ex.
     * 
     * The second try block will read from the animals ArrayList passed to the
     * method and print each line to the file using a loop.
     * It will have a blanket catch using Exception ex.
     * Finally it will close outputFile.
     * 
     * @param animals
     */
    public static void writeFile(String fileName, ArrayList<Animal> animals) {
        PrintWriter outputFile = null;
        try {
        	File file = new File(fileName);
        	outputFile = new PrintWriter(file);
        }
        catch(FileNotFoundException ex) {
        	System.out.println("Cannot find file, please try again.");
        }
        
        try {
        	for(Animal list: animals) {
        		outputFile.println(list);
        	}
        }
        catch(Exception ex) {
        	System.out.println("List not found, please try again.");
        }
        
        finally{
        	outputFile.close();
        }
    }

    /**
     * readFile
     * 
     * In this method, we are going to read animals.txt and print out what is read.
     * We will need two different try/catch blocks.
     * The first try block will open the file using java.io.File and
     * java.util.Scanner. It will catch errors using FileNotFoundException ex.
     * 
     * The second try block will read each line from the txt file and print each
     * line in the console. It will have a blanket Exception ex and finally it will
     * close the Scanner.
     * 
     * @param fileName
     */
    public static void readFile(String fileName) {
        Scanner fileReader = null;
        try {
        	File file = new File(fileName);
        	fileReader = new Scanner(file);
        }
        catch(FileNotFoundException ex) {
        	System.out.println("File not found, please try again.");
        }
        try {
        	while(fileReader.hasNextLine()) {
        		System.out.println(fileReader.nextLine());
        	}
        }
        catch(Exception ex) {
        	System.out.println("File cannot be read.");
        }
        finally {
        	fileReader.close();
        }
    }

    /**
     * main
     * 
     * Inside the main method, we simply create five animal objects, add them to an arraylist, and call our methods.
     * 
     * DO NOT TOUCH THE MAIN METHOD.
     * @param args
     */
    public static void main(String[] args) {
        //Filename variable to pass to our methods
        String fileName = "animals.txt";

        //Arraylist of our animals and our five animal objects.
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal(4, 1));
        animals.add(new Animal(4, 2));
        animals.add(new Animal(4, 3));
        animals.add(new Animal(4, 4));
        animals.add(new Animal(4, 5));

        //Calls the method to write to the animals.txt file.
        writeFile(fileName, animals);

        //Calls the method to read the animals.txt file and print out each line.
        readFile(fileName);
    }

}