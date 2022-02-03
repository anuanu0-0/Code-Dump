package Part_2;

import java.util.*;
import java.util.regex.*;

public class Question2 {
    // Input cannot be empty and must follow given conditions
    private static final String REGEX = "^[a-zA-Z0-9_]+$";

    private static String readInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        return input;
    }

    private static String isValid(String input) throws InvalidInputException{
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find())
            return  "ACCEPTED";
        else
            throw new InvalidInputException("String entered is in invalid format");
    }

    public static void main(String[] args){

        // Get the string
        String str = readInput();

        // Validate the string
        String output = null;
        try {
            output = isValid(str);
            System.out.println(output);
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }

    }
}
