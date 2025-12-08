/**
* Cooking Measurement Converter 
* 
* Simple utility to convert between common cooking measurements
*
* USAGE:
* Input format:
*   [value] [from units] [to units]
* Units:
*   Milliliters -> ml
*   Cups -> cup
*   Tablespoons -> tbsp
*   Teaspoons -> tsp
* Example use:
*   java -cp bin/ Converter 1 cup tbsp
*
* @version  0.1.0
* @since    2.12.2025
* @author   AlexandrAnatoliev
*/
public class Converter {
    /** Main entry point for the Converter application
    *
    * @param args command line arguments 
    *   [value]         Value of user's product     
    *   [from units]    Units need to convert from     
    */
    public static void main(String[] args) {
        if (args.length > 1) {
            try {
                double value = Double.parseDouble(args[0]);
                Scale from = parse(args[1]);

                if (from == Scale.ERROR) {
                    printExample();
                }
                else {
                    System.out.println(value + " " + args[1] + " = "
                            + convert(value, from) + " " 
                            + (from == Scale.C ? "F" : "C"));
                }
            } catch (IllegalArgumentException e) {
                System.out.println(Colors.RED.apply("\nERROR: " + e.getMessage()));
                printExample();
            }
        } 
        else {
            printExample();
        }
    }

    /**
    * Converts value from one units to other units
    *
    * @param value  Value of user's product
    * @param from   Units need to convert from
    * @param to     Units need to convert to
    * @return int   Result of converting 
    */
    public static double convert(double value, Scale from) {
        switch (from) {
            case F:
                return (value - 32) * 5 / 9;
            default:
                return (value + 9 / 5) + 32;
        }
    }

    /**
    * Parses input string to Measures value
    *
    * @param input  Measure in string
    * @throws IllegalArgumentException If input is illegal argument
    * @return int   Result of parsing 
    */
    public static Scale parse(String input) {
        try {
            return Scale.valueOf(input.toUpperCase().substring(0,1));
        } catch (IllegalArgumentException e) {
            System.out.println(Colors.RED.apply("ERROR: " + e.getMessage()));
            return Scale.ERROR;
        }
    }

    /**
    * Prints usage instructions
    */
    public static void printExample() {
        System.out.println(Colors.YELLOW.apply("\nInput format:"));
        System.out.println("Converter [value] [from units] [to units]");
        System.out.println(Colors.YELLOW.apply("Units:"));
        System.out.println("Milliliters -> ml");
        System.out.println("Cups -> cup");
        System.out.println("Tablespoons -> tbsp");
        System.out.println("Teaspoons -> tsp");
        System.out.println(Colors.YELLOW.apply("Example use:"));
        System.out.println("java -cp bin/ Converter 1 cup tbsp");
    }
}
