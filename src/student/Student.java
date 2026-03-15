package student;

import java.util.*;



public class Student {
    private final String name;
    private final String id;

    // Keeps the list of course codes the student is enrolled in.
    // We store codes instead of Course objects to avoid reference issues and simplify lookups.
    private final List<String> enrolledCourseCodes;

    // Maps courseCode -> grade for this student
    private final Map<String, Double> gradesByCourseCode;

    public Student(String name, String id, List<String> enrolledCourseCodes, Map<String, Double> gradesByCourseCode) {
        this.id = id;
        this.name = name;
        this.enrolledCourseCodes = enrolledCourseCodes != null ? new ArrayList<>(enrolledCourseCodes) : new ArrayList<>();
        this.gradesByCourseCode = gradesByCourseCode != null ? new HashMap<>(gradesByCourseCode) : new HashMap<>();
    }
    public Optional<Double> getGradeForCourse(Course course) {
        String code = course.getCourseCode();
        return Optional.ofNullable(gradesByCourseCode.get(code));
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<String> getEnrolledCourseCodes() {
        // Return an unmodifiable copy to protect internal state
        return Collections.unmodifiableList(enrolledCourseCodes);
    }

    public Map<String, Double> getGradesByCourseCode() {
        // Return an unmodifiable view to protect internal state
        return Collections.unmodifiableMap(gradesByCourseCode);
    }

    /**
     * Enrolls this student in the given course by course code.
     * @param course the Course object
     * @return true if enrolled, false if already enrolled
     */
    public boolean enrollInCourse(Course course) {
        String code = course.getCourseCode();
        if (enrolledCourseCodes.contains(code)) {
            return false; // already enrolled
        }
        enrolledCourseCodes.add(code);
        return true;
    }

    /**
     * Assigns a grade for a given course to this student.
     * Student must be enrolled in that course.
     * @param course the Course object
     * @param grade the grade (0-100)
     */
    public void assignGrade(Course course, double grade) {
        String code = course.getCourseCode();

        if (!enrolledCourseCodes.contains(code)) {
            throw new IllegalStateException("Student is not enrolled in course " + code);
        }
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }

        gradesByCourseCode.put(code, grade);
    }
}
