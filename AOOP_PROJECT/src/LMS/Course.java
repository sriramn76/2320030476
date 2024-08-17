package LMS;

public class Course {
    private String courseId;
    private String courseName;
    private String description;
    private Instructor instructor;

    public Course(String courseId, String courseName, String description, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
        this.instructor = instructor;
    }
}
