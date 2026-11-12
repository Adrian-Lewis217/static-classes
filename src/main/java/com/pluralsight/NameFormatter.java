package com.pluralsight;

public class NameFormatter {

    public NameFormatter() {
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        return lastName + ", " + prefix + " " + firstName + " " + middleName + ", " + suffix;
    }

    public static String format(String firstName,String lastName){
        return lastName + ", " + firstName;
    }

    public static String format(String fullName){

        String[] sections = fullName.split(" ");

        String prefix = "";
        String firstName = "";
        String middleName = "";
        String lastName = "";
        String suffix = "";

        // if user enters different full names

        int start = 0;
        int end = sections.length - 1;

        if (sections[0].equalsIgnoreCase("Mr") ||
                sections[0].equalsIgnoreCase("Mr.") ||
                sections[0].equalsIgnoreCase("Mrs") ||
                sections[0].equalsIgnoreCase("Mrs.") ||
                sections[0].equalsIgnoreCase("Ms") ||
                sections[0].equalsIgnoreCase("Ms.") ||
                sections[0].equalsIgnoreCase("Dr") ||
                sections[0].equalsIgnoreCase("Dr.")) {

            prefix = sections[0];
            start++;
        }

        if (sections[end].equalsIgnoreCase("Jr") ||
                sections[end].equalsIgnoreCase("Sr") ||
                sections[end].equalsIgnoreCase("III") ||
                sections[end].equalsIgnoreCase("PhD")) {

            suffix = sections[end];
            end--;
        }

        firstName = sections[start];
        lastName = sections[end];

        if (end - start > 1) {
            middleName = sections[start + 1];
        }

        String result = lastName + ", ";

        if (!prefix.isEmpty()) {
            result += prefix;
        }

        result += firstName;

        if (!middleName.isEmpty()) {
            result += " " + middleName;
        }

        if (!suffix.isEmpty()) {
            result += ", " + suffix;
        }

        return result;
    }
}
