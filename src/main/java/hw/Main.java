package hw;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int max = 0;
        if (args.length > 0) {
            try {
                max = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException e)

            {
                System.err.println("The argument entered must be an integer ");
                System.exit(1);
            }
            FizzBuzz.fizzBuzz(max);
        }
    }



    }


