import java.util.Locale;

public class ExceptionsLecture {
    public static void main(String[] args) {
//        try{
//            System.out.println("divide by zero");
//            int result = 1/0;
//            System.out.println("Hahah math.");
//        } catch(ArithmeticException e) {
//            e.printStackTrace();
//        }

        //An even bigger try catch:
        try {
//            /**example 1**/throw new Exception("some error code here");
//            /**example 2**/throw new RuntimeException("runtime exception!");
            /**example 3**/String nullStr = null;
            /**example 3**/System.out.println(nullStr.toLowerCase());
        } catch (NullPointerException e) {
            System.out.println("this null pointer exception fired");
            e.printStackTrace();
            e.getMessage();
        } catch (RuntimeException e) {
            System.out.println("this runtime exception fired");
            e.printStackTrace();
            e.getMessage();
        } catch (Exception e) {
            System.out.println("this exception fired");
            e.printStackTrace();
            e.getMessage();
        } finally {
            System.out.println("SEE ME");
        }
    }
}
/**TYPES OF EXCEPTIONS
 * checked: MUST be handled.
 * unchecked: DOES NOT NEED to be handled.
 * Exception: recoverable error occurs.
 * Runtime Exception: error that occurs during runtime. can be prevented programmatically.
 * Error: non-recoverable error occurs. Serious.
 *
 *
 *                       THROWABLE
 *                    /           \                                         **The further down the tree,
 *                  /              \                                        **The more specific the error is.
 *         EXCEPTION(checked)      ERROR(unchecked)
 *      /           \         \                 \
 *     /             \          \                 \
 * RunTimeException   \           \            OutOfMemoryError
 *    /                 \           \
 *NullPointerException   \            \
 *                  IOException         MyCustomException
 *
 **/

