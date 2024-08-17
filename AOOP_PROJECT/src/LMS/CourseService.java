package LMS;

import java.util.HashMap;
import java.util.Map;

public class CourseService {
    private Map<String, Course> courses = new HashMap<>();

    public boolean createCourse(String courseId, String courseName, String description, Instructor instructor) {
        if (courses.containsKey(courseId) || courseId == null || courseName == null || instructor == null) {
            return false;
        }
        Course course = new Course(courseId, courseName, description, instructor);
        courses.put(courseId, course);
        return true;
    }
}
