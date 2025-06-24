package Strings;

class NullPointerExceptionDemo {
    public static void main(String[] args) {
        generateException();
        handleException();
    }

    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        int length = text.length();
    }

    public static void handleException() {
        try {
            String text = null;
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}