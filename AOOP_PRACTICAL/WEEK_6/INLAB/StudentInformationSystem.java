package INLAB;

public class StudentInformationSystem {
    public static void main(String[] args) {
        Student student1 = new Student("Sriram", "S001");
        Student student2 = new Student("Chandra", "S002");
        Student student3 = new Student("Shannu", "S003");
        Student student4 = new Student("Jayram", "S004");
        Course course1 = new Course("C001", "AOOP");
        Course course2 = new Course("C002", "AIML");
        Course course3 = new Course("C003", "Operating Systems");
        Course course4 = new Course("C004", "French");
        Course course5 = new Course("C005", "German");
        Course course6 = new Course("C006", "SIL");
        EnrollmentService enrollmentService = new EnrollmentService();
        
        enrollmentService.enroll(student1, course1);
        enrollmentService.enroll(student1, course5);
        enrollmentService.enroll(student2, course1);
        enrollmentService.enroll(student2, course3);
        enrollmentService.enroll(student2, course6);


        
        enrollmentService.enroll(student3, course1);
        
        
        enrollmentService.enroll(student3, course4);
        
        enrollmentService.enroll(student3, course6);
        enrollmentService.enroll(student4, course2);
        
        enrollmentService.enroll(student4, course6);
        enrollmentService.enroll(student4, course5);
        
        
        
        printCourseEnrollments(course1);
        printCourseEnrollments(course2);
        printCourseEnrollments(course3);
        printCourseEnrollments(course4);
        printCourseEnrollments(course5);
        printCourseEnrollments(course6);
    }

    private static void printCourseEnrollments(Course course) {
        System.out.println("Students enrolled in " + course.getCourseName() + ":");
        for (Student student : course.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
        System.out.println();
    }
}