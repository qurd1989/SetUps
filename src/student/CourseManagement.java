package student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseManagement {
    // Private static storage (system-wide, shared)
    private static final Map<String, Course> coursesByCode = new HashMap<>();
    private static final Map<String, Student> studentsById = new HashMap<>();

    // overall course grade per student (studentId -> overallGrade)
    private static final Map<String, Double> overallGradesByStudentId = new HashMap<>();

    private CourseManagement() {
        // Prevent instantiation
    }

    public static boolean addCourse(String courseCode, String name, int maxCapacity) {
        String code = normalizeCourseCode(courseCode);
        if (coursesByCode.containsKey(code)) {
            return false;
        }
        Course c = new Course(code, name, maxCapacity);
        coursesByCode.put(code, c);
        return true;
    }

    public static boolean addStudent(String name, String studentId) {
        String id = normalizeStudentId(studentId);
        if (studentsById.containsKey(id)) {
            return false;
        }
        Student s = new Student(name, id, new ArrayList<>(), new HashMap<>());
        studentsById.put(id, s);
        return true;
    }

    public static Course getCourseByCode(String courseCode) {
        return coursesByCode.get(normalizeCourseCode(courseCode));
    }

    public static Student getStudentById(String studentId) {
        return studentsById.get(normalizeStudentId(studentId));
    }

    public static List<Course> listCourses() {
        return new ArrayList<>(coursesByCode.values());
    }

    public static List<Student> listStudents() {
        return new ArrayList<>(studentsById.values());
    }

    /**
     * Enroll student in a course:
     * - checks capacity
     * - calls Student.enrollInCourse(...)
     * - increments Course enrollment (and static total)
     */
    public static void enrollStudent(Student student, Course course) {
        if (student == null || course == null) {
            throw new IllegalArgumentException("Student and course cannot be null.");
        }

        if (!course.hasCapacity()) {
            throw new IllegalStateException("Course is full. Cannot enroll.");
        }

        boolean enrolled = student.enrollInCourse(course);
        if (!enrolled) {
            throw new IllegalStateException("Student is already enrolled in this course.");
        }

        // Only after successful enrollment for the student do we increment the course enrollment
        course.incrementEnrollment();
    }

    /**
     * Assign grade to student for a course:
     * calls Student.assignGrade(...)
     */
    public static void assignGrade(Student student, Course course, double grade) {
        if (student == null || course == null) {
            throw new IllegalArgumentException("Student and course cannot be null.");
        }
        student.assignGrade(course, grade);
    }

    /**
     * Calculates overall grade for a student as an average of their assigned grades.
     * Stores it in overallGradesByStudentId (static map).
     *
     * @return overall grade
     */
    public static double calculateOverallGrade(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }

        Map<String, Double> grades = student.getGradesByCourseCode();

        if (grades.isEmpty()) {
            // Store as 0.0 for convenience; interface can display "N/A"
            overallGradesByStudentId.put(student.getId(), 0.0);
            return 0.0;
        }

        double sum = 0.0;
        for (double g : grades.values()) {
            sum += g;
        }
        double overall = sum / grades.size();
        overallGradesByStudentId.put(student.getId(), overall);
        return overall;
    }

    public static Double getStoredOverallGrade(String studentId) {
        return overallGradesByStudentId.get(normalizeStudentId(studentId));
    }

    // Helpers
    private static String normalizeCourseCode(String code) {
        if (code == null || code.trim().isEmpty()) {
            throw new IllegalArgumentException("Course code cannot be empty.");
        }
        return code.trim().toUpperCase();
    }

    public static String normalizeStudentId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be empty.");
        }
        return id.trim().toUpperCase();
    }
}
