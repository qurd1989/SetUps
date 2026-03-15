package student;

public class Course {
    private final String courseCode;
    protected final String name;
    private int maxCapacity;
    private int currentEnrolled;

    // Static: shared across ALL Course objects
    private static int totalEnrolledStudentsAcrossAllCourses = 0;

    public Course(String courseCode, String name, int maxCapacity) {
        if (courseCode == null || courseCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Course code cannot be empty.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Course name cannot be empty.");
        }
        if (maxCapacity <= 0) {
            throw new IllegalArgumentException("Max capacity must be > 0.");
        }

        this.courseCode = courseCode.trim().toUpperCase();
        this.name = name.trim();
        this.maxCapacity = maxCapacity;
        this.currentEnrolled = 0;
    }

    // Public getters as required
    public String getCourseCode() {
        return courseCode;
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentEnrolled() {
        return currentEnrolled;
    }

    // Optional update method (supports rubric "course update" idea)
    public void setMaxCapacity(int maxCapacity) {
        if (maxCapacity <= 0) {
            throw new IllegalArgumentException("Max capacity must be > 0.");
        }
        if (maxCapacity < currentEnrolled) {
            throw new IllegalArgumentException("Max capacity cannot be less than current enrolled.");
        }
        this.maxCapacity = maxCapacity;
    }

    public boolean hasCapacity() {
        return currentEnrolled < maxCapacity;
    }

    /**
     * Increments enrollment for this course and updates the static total.
     * This should only be called after verifying capacity and a successful student enrollment.
     */
    public void incrementEnrollment() {
        if (!hasCapacity()) {
            throw new IllegalStateException("Course is at maximum capacity.");
        }
        currentEnrolled++;
        totalEnrolledStudentsAcrossAllCourses++;
    }

    /**
     * Static method required by the assignment.
     * @return total enrolled students across all Course objects
     */
    public static int getTotalEnrolledStudents() {
        return totalEnrolledStudentsAcrossAllCourses;
    }
}