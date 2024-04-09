package slot7;

public class Client {
    public Client() {
        // To do:
    }

    public void doUnchecked(String value) {
        try {
            int result = ExceptionHandler.canThrowUncheckedException(value);
            System.out.println("result=" + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
    }

    public void doChecked() {
        try {
            ExceptionHandler.canThrowCheckedException();
            System.out.println("OK");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
