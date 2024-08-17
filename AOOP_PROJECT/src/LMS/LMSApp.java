package LMS;

import java.util.Scanner;

public class LMSApp {
    public static void main(String[] args) {
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();
        GradingService gradingService = new GradingService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Create Course");
            System.out.println("2. Enroll User");
            System.out.println("3. Enter Grade");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter Course ID:");
                    String courseId = scanner.nextLine();
                    System.out.println("Enter Course Name:");
                    String courseName = scanner.nextLine();
                    System.out.println("Enter Course Description:");
                    String description = scanner.nextLine();
                    System.out.println("Enter Instructor Name:");
                    String instructorName = scanner.nextLine();
                    Instructor instructor = new Instructor(instructorName);
                    boolean courseCreated = courseService.createCourse(courseId, courseName, description, instructor);
                    System.out.println(courseCreated ? "Course created successfully." : "Failed to create course.");
                    break;
                case 2:
                    System.out.println("Enter Course ID:");
                    courseId = scanner.nextLine();
                    System.out.println("Enter User Name:");
                    String userName = scanner.nextLine();
                    User user = new User(userName);
                    boolean userEnrolled = enrollmentService.enrollUser(courseId, user);
                    System.out.println(userEnrolled ? "User enrolled successfully." : "Failed to enroll user.");
                    break;
                case 3:
                    System.out.println("Enter Course ID:");
                    courseId = scanner.nextLine();
                    System.out.println("Enter User Name:");
                    userName = scanner.nextLine();
                    System.out.println("Enter Grade (0-100):");
                    int grade = scanner.nextInt();
                    scanner.nextLine();  
                    user = new User(userName);
                    boolean gradeEntered = gradingService.enterGrade(courseId, user, grade);
                    System.out.println(gradeEntered ? "Grade entered successfully." : "Failed to enter grade.");
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice L");
                    break;
            }
        }
    }
}
