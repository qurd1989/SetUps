package student;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt("Choose an option: ");

            try {
                switch (choice) {
                    case 1:
                        handleAddCourse();
                        break;
                    case 2:
                        handleAddStudent();
                        break;
                    case 3:
                        handleEnrollStudent();
                        break;
                    case 4:
                        handleAssignGrade();
                        break;
                    case 5:
                        handleCalculateOverallGrade();
                        break;
                    case 6:
                        handleShowTotalEnrolled();
                        break;
                    case 7:
                        handleListCourses();
                        break;
                    case 8:
                        handleListStudents();
                        break;
                    case 0:
                        running = false;
                        System.out.println("Exiting... Goodbye.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            } catch (Exception ex) {
                // Error handling requirement: show friendly message
                System.out.println("Error: " + ex.getMessage());
            }

            System.out.println(); // spacing
        }
    }

    private static void printMenu() {
        System.out.println("=======================================");
        System.out.println(" Course Enrollment & Grade Management");
        System.out.println("=======================================");
        System.out.println("1) Add a new course");
        System.out.println("2) Add a new student");
        System.out.println("3) Enroll student in a course");
        System.out.println("4) Assign grade to student for a course");
        System.out.println("5) Calculate overall grade for a student");
        System.out.println("6) Show total enrolled students (all courses)");
        System.out.println("7) List all courses");
        System.out.println("8) List all students");
        System.out.println("0) Exit");
        System.out.println("---------------------------------------");
    }

    private static void handleAddCourse() {
        String code = readString("Enter course code (e.g., CS101): ");
        String name = readString("Enter course name: ");
        int cap = readInt("Enter max capacity: ");

        boolean added = CourseManagement.addCourse(code, name, cap);
        if (added) {
            System.out.println("Course added successfully.");
        } else {
            System.out.println("Course code already exists. Course not added.");
        }
    }

    private static void handleAddStudent() {
        String id = readString("Enter student ID (e.g., S1): ");
        String name = readString("Enter student name: ");

        boolean added = CourseManagement.addStudent(name, id);
        if (added) {
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Student ID already exists. Student not added.");
        }
    }

    private static void handleEnrollStudent() {
        String studentId = readString("Enter student ID: ");
        String courseCode = readString("Enter course code: ");

        Student s = CourseManagement.getStudentById(studentId);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        Course c = CourseManagement.getCourseByCode(courseCode);
        if (c == null) {
            System.out.println("Course not found.");
            return;
        }

        CourseManagement.enrollStudent(s, c);
        System.out.println("Student enrolled successfully.");
    }

    private static void handleAssignGrade() {
        String studentId = readString("Enter student ID: ");
        String courseCode = readString("Enter course code: ");
        double grade = readDouble("Enter grade (0-100): ");

        Student s = CourseManagement.getStudentById(studentId);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        Course c = CourseManagement.getCourseByCode(courseCode);
        if (c == null) {
            System.out.println("Course not found.");
            return;
        }

        CourseManagement.assignGrade(s, c, grade);
        System.out.println("Grade assigned successfully.");
    }

    private static void handleCalculateOverallGrade() {
        String studentId = readString("Enter student ID: ");

        Student s = CourseManagement.getStudentById(studentId);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        if (s.getGradesByCourseCode().isEmpty()) {
            System.out.println("No grades assigned yet. Overall grade: N/A");
            return;
        }
        double overall = CourseManagement.calculateOverallGrade(s);
        System.out.printf("Overall grade for %s (%s): %.2f%n", s.getName(), s.getId(), overall);
    }

    private static void handleShowTotalEnrolled() {
        int total = Course.getTotalEnrolledStudents();
        System.out.println("Total enrolled students across ALL courses: " + total);
    }

    private static void handleListCourses() {
        List<Course> courses = CourseManagement.listCourses();
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        System.out.println("Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseCode() + " | " + c.getName()
                    + " | capacity: " + c.getCurrentEnrolled() + "/" + c.getMaxCapacity());
        }
    }

    private static void handleListStudents() {
        List<Student> students = CourseManagement.listStudents();
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("Students:");
        for (Student s : students) {
            System.out.println("- " + s.getId() + " | " + s.getName()
                    + " | enrolled: " + s.getEnrolledCourseCodes());
        }
    }


    private static String readString(String prompt) {
        System.out.print(prompt);
        String val = scanner.nextLine();
        return val == null ? "" : val.trim();
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number. Please enter an integer.");
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number. Please enter a valid decimal number.");
            }
        }
    }
}