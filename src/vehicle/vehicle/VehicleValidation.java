package vehicle;

import java.util.Set;

/**
 * Small validation helpers shared by vehicle model classes.
 */
final class VehicleValidation {
    static final int MIN_YEAR = 1886;
    static final int MAX_YEAR = 2100;

    private VehicleValidation() {
        // Utility class
    }

    static String requireNonBlank(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be blank.");
        }
        return value.trim();
    }

    static int requireYearInRange(int year) {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            throw new IllegalArgumentException(
                    "Year must be between " + MIN_YEAR + " and " + MAX_YEAR + "."
            );
        }
        return year;
    }

    static String normalizeOption(String value, String fieldName, Set<String> allowedValues) {
        String normalized = requireNonBlank(value, fieldName).toLowerCase();
        if (!allowedValues.contains(normalized)) {
            throw new IllegalArgumentException(fieldName + " must be one of: " + allowedValues + ".");
        }
        return normalized;
    }
}

