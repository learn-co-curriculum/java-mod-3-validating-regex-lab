# Validating with Regular Expressions Lab

## Learning Goals

- Use the `Pattern` class to practice validating in Java.

## Instructions

Create a validator to determine if a phone number is a real phone number in a
certain format.

Follow the given instructions and tips:

- Create a `PhoneNumberValidator` class.
  - The `PhoneNumberValidator` should have a phone number that comes from user
    input.
  - A constructor that takes in the above property.
  - A method called `isValid()` that returns a boolean to determine if the
    phone number is valid.
    - A phone number is valid if the following is met:
      - The phone number is in the format (XXX)XXX-XXXX or (XXX) XXX-XXXX.
      - The first number in the area code (XXX) must be a digit in the range
        [2-9]. The second and third digit can be in the range [0-9].
      - The first number in the next grouping (this next grouping is called the
        central office code) must be a digit in the range [2-9]. The second and
        third digits can be in the range [0-9].
      - The last four digits in the phone number can be in the range [0-9].
      - Examples:
        - (000) 234-5678 is not a valid phone number.
        - (100) 234-5678 is not a valid phone number.
        - (222) 012-3456 is not a valid phone number.
        - (222) 123-4567 is not a valid phone number.
        - (200) 200-0000 is a valid phone number.
        - (222) 200-2222 is a valid phone number.
- Use the `PhoneNumberDriver` class to run your code and use as a reference to
  how your code will be tested.

## Starter Code

Consider the driver class when writing the code for the `PhoneNumberValidator`
class:

```java
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
```

## Example Output

Here are some example runs of the code for your reference. Make sure your output
looks the same when given these values. Also, don't forget to use the Regex 101
tool to help you too!

Example Output 1:

```plaintext
Please enter a phone number in the format (XXX) XXX-XXXX or (XXX)XXX-XXXX:
(555) 555-1234
(555) 555-1234 is a valid phone number.
```

Example Output 2:

```plaintext
Please enter a phone number in the format (XXX) XXX-XXXX or (XXX)XXX-XXXX:
(555)555-1234
(555)555-1234 is a valid phone number.
```

Example Output 3:

```plaintext
Please enter a phone number in the format (XXX) XXX-XXXX or (XXX)XXX-XXXX:
(000) 234-5678
(000) 234-5678 is not a valid phone number.
```

Example Output 4:

```plaintext
Please enter a phone number in the format (XXX) XXX-XXXX or (XXX)XXX-XXXX:
(222) 123-4567
(222) 123-4567 is not a valid phone number.
```

Example Output 5:

```plaintext
Please enter a phone number in the format (XXX) XXX-XXXX or (XXX)XXX-XXXX:
(222) 200-2222
(222) 200-2222 is a valid phone number.
```

## Resources

- [North American Numbering Plan](https://en.wikipedia.org/wiki/North_American_Numbering_Plan)
- [Regex 101](https://regex101.com)
