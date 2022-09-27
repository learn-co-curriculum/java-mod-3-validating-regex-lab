import java.util.Scanner;

public class PhoneNumberDriver {
    public static void main(String[] args) {
        // Initialize a Scanner object to take in input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a phone number
        System.out.println("Please enter a phone number in the format (XXX) XXX-XXXX or (XXX)XXX-XXXX:");
        String phoneNumber = scanner.nextLine();

        PhoneNumberValidator validator = new PhoneNumberValidator(phoneNumber);

        if (validator.isValid()) {
            System.out.println(phoneNumber + " is a valid phone number.");
        } else {
            System.out.println(phoneNumber + " is not a valid phone number.");
        }
    }
}
