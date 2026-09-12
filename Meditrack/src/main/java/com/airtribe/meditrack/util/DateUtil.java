package com.airtribe.meditrack.util;

import com.airtribe.meditrack.constants.Constants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(Constants.DATE_FORMAT);

    private DateUtil() {}

    public static String format(LocalDateTime dateTime) {
        return null;
    }

    public static LocalDateTime parse(String text) {
        return null;
    }
}
