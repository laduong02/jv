package slot7;

public class ExceptionHandler {
    public static int canThrowUncheckedException(String value) throws NumberFormatException {
        return Integer.parseInt(value);
    }

    public static void canThrowCheckedException() throws Exception {
        throw new Exception("Failure");
    }
}