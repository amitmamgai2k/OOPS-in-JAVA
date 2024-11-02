public class Question11 {
    public static void main(String[] args) {
        String[] array = {"100", "10.2", "5.hello", "100hello"};
        for (int i = 0; i < array.length; i++) {
            String data = array[i]; // Get the current string
            try {
                int integervalue = Integer.parseInt(data);
                System.out.println(data + " is a valid integer: " + integervalue);
            } catch (NumberFormatException e) {
                // If integer parsing fails, attempt to parse as a double
                try {
                    double doubleValue = Double.parseDouble(data);
                    System.out.println(data + " is a valid double: " + doubleValue);
                } catch (NumberFormatException ex) {
                    // If both parsing attempts fail
                    System.out.println(data + " is not a valid integer or double.");
                }
            }
        }
    }
}
