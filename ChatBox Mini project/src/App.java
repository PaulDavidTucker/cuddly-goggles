import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        RunProgram();
    }

    //Method doing the work 
    public static void RunProgram() {
        GreetUserAndGetName();
    }

    //Method to greet a user, which will return their name 
    public static String GreetUserAndGetName() {
        //Uses prewritten method to input a string and stores value
        String name = InputString("Hello! I'm Chatty, your local chatbot. What's your name?");   
        //display output   
        System.out.println("Its so lovely to meet you!");
        //Uses prewritten method to input an inetger and stores value
        AskAge(name);
        //returns name
        return name;
    }

    //method to take an input and return it
    public static Integer AskAge(String name) {
        //Uses prewritten method to input an inetger and stores value
        int age = InputInteger("So your name is: "+ name +" ? Thats a nice name! /nHow old are you?");
        System.out.println("So you're "+ age+" ?");
        return age;
    }

    // Method that takes a string as a parameter, which is then used to print out a
    // message, recives an int from the scanner and returns it
    public static int InputInteger(String message) {
        // Variable declaration
        int InputtedInteger;
        // Creation of a scanner object
        Scanner input = new Scanner(System.in);
        // Prints to console the inputted text
        System.out.print(message + " ");
        // Uses the .nextInt(); to take a keyboard input from the user.
        InputtedInteger = input.nextInt();
        // returns inputted value
        return InputtedInteger;
    }

    // Method that takes a string as a parameter, which is then used to print out a
    // message, recives string from the scanner and returns it
    public static String InputString(String message) {
        // Variable declaration
        String InputtedString;
        // Creation of a scanner object
        Scanner input = new Scanner(System.in);
        // Prints to console the inputted text
        System.out.print(message + " ");
        // Uses the .nextInt(); to take a keyboard input from the user.
        InputtedString = input.nextLine();
        // returns inputted value
        return InputtedString;
    }
}
