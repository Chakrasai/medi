package com.airtribe.meditrack.util;

import java.io.IOException;
import java.util.List;

// basic CSV read/write - not wired into Main yet, here in case we want
// data to survive a restart
public class CSVUtil {

    private CSVUtil() {}

    public static List<String[]> readCSV(String filePath) throws IOException {
        return null;
    }

    public static void writeCSV(String filePath, List<String[]> rows) throws IOException {
    }

    public static void appendRow(String filePath, String[] row) throws IOException {
    }
}
