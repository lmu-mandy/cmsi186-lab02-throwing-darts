/**
 * Filename: SharedBirthday.java
 * Description:
 * Author:
 * Date:
 */

 public class SharedBirthday {

    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                throw new IllegalArgumentException("Exactly three arguments required");
            }
            //
            // TODO: Parse the command line argument and call your estimate function
            //
        } catch (NumberFormatException e) {
            //
            // TODO: Take care of a possible non-integer argument.
            //
        } catch (IllegalArgumentException e) {
            //
            // TODO: Take care of the exception you threw above.
            //
        }
    }

    public static double probabilityEstimate(int people, int days, int trials) {
        //
        // TODO: Do the main work here. I've just returned 0.0 as a place holder
        // so the code compiles. It isn't right though. Remove the return here and
        // implement the whole method on your own.
        //
        return 0.0;
    }

    //
    // TODO: Don't be afraid to write private helper methods to keep your code modular.
    //
}
