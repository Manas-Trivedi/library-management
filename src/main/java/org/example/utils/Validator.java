package org.example.utils;

public class Validator {

    public static boolean isValidId(String id) {
        return id != null && !id.trim().isEmpty();
    }

    public static boolean isValidString(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public static boolean isValidAvailability(String availability) {
        return "Available".equalsIgnoreCase(availability) ||
                "Checked Out".equalsIgnoreCase(availability);
    }
}