package prac2;

import java.util.Scanner;

class InvalidAgeExceptions extends Exception {

    public InvalidAgeExceptions(String message) {
        super(message);
    }
}
public class Lab4Anudip {

    static void checkAge(int age) throws InvalidAgeExceptions {
        if (age < 18) {
            throw new InvalidAgeExceptions("Age must be 18 or above.");
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (InvalidAgeExceptions e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        sc.close();
    }
}
