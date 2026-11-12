package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    // test for format(fullName)
    @Test
    public void format_FullName_ReturnsFormattedName(){
        // Arrange
        String fullName = "Adrian Christopher Lewis";
        String expected = "Lewis, Adrian Christopher";
        // Act
        String result = NameFormatter.format(fullName);

        // Assert
        assertEquals(expected,result);
    }

    @Test
    public void format_FullNameWithPrefixAndSuffix_ReturnFormattedName(){
        // Arrange
        String prefix = "Dr.";
        String firstName = "Mel";
        String middleName = "B";
        String lastName = "Johnson";
        String suffix = "PhD";

        String expected = "Johnson, Dr. Mel B, PhD";

        // Act
        String result = NameFormatter.format(prefix,firstName,middleName,lastName,suffix);

        // Assert
        assertEquals(expected,result);
    }

}