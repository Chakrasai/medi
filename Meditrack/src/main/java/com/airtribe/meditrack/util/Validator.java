package com.airtribe.meditrack.util;

import com.airtribe.meditrack.exception.InvalidDataException;

// input validation lives here so we're not repeating checks in every service
public class Validator {

    private Validator() {}

    public static void validateName(String name) throws InvalidDataException {
    }

    public static void validateAge(int age) throws InvalidDataException {
    }

    public static void validateContact(String contact) throws InvalidDataException {
    }

    public static void validateDuration(int duration) throws InvalidDataException {
    }
}
