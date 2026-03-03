package student;

/**
 * Test to demonstrate cache invalidation fix
 * Shows that grades are correctly recalculated after new grades are assigned
 */
public class CacheInvalidationTest {
    public static void main(String[] args) {
        System.out.println("=== Cache Invalidation Test ===\n");

        // Setup
        CourseManagement.addStudent("Alice", "S001");
        CourseManagement.addCourse("CS101", "Intro to CS", 30);
        CourseManagement.addCourse("CS102", "Data Structures", 30);

        Student student = CourseManagement.getStudentById("S001");
        Course cs101 = CourseManagement.getCourseByCode("CS101");
        Course cs102 = CourseManagement.getCourseByCode("CS102");

        // Enroll student
        CourseManagement.enrollStudent(student, cs101);

        // Assign first grade and calculate
        CourseManagement.assignGrade(student, cs101, 85.0);
        double grade1 = CourseManagement.calculateOverallGrade(student);
        System.out.println("After assigning grade 85 to CS101:");
        System.out.println("  Overall Grade: " + grade1);
        System.out.println("  Expected: 85.0\n");

        // Assign second grade and calculate
        CourseManagement.enrollStudent(student, cs102);
        CourseManagement.assignGrade(student, cs102, 95.0);
        double grade2 = CourseManagement.calculateOverallGrade(student);
        System.out.println("After assigning grade 95 to CS102:");
        System.out.println("  Overall Grade: " + grade2);
        System.out.println("  Expected: 90.0 (average of 85 and 95)\n");

        // Update first grade and verify cache invalidation
        CourseManagement.assignGrade(student, cs101, 90.0);
        double grade3 = CourseManagement.calculateOverallGrade(student);
        System.out.println("After updating CS101 grade to 90:");
        System.out.println("  Overall Grade: " + grade3);
        System.out.println("  Expected: 92.5 (average of 90 and 95)\n");

        // Verify correctness
        boolean test1 = Math.abs(grade1 - 85.0) < 0.01;
        boolean test2 = Math.abs(grade2 - 90.0) < 0.01;
        boolean test3 = Math.abs(grade3 - 92.5) < 0.01;

        if (test1 && test2 && test3) {
            System.out.println("✅ ALL TESTS PASSED - Cache invalidation working correctly!");
        } else {
            System.out.println("❌ TESTS FAILED:");
            if (!test1) System.out.println("  - Test 1 failed");
            if (!test2) System.out.println("  - Test 2 failed");
            if (!test3) System.out.println("  - Test 3 failed");
        }
    }
}

