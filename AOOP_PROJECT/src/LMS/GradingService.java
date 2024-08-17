package LMS;

import java.util.HashMap;
import java.util.Map;

public class GradingService {
    private Map<String, Map<User, Integer>> grades = new HashMap<>();

    public boolean enterGrade(String courseId, User user, int grade) {
        if (grade < 0 || grade > 100) {
            return false;
        }
        if (!grades.containsKey(courseId)) {
            grades.put(courseId, new HashMap<User, Integer>()); 
        }
        Map<User, Integer> courseGrades = grades.get(courseId);
        courseGrades.put(user, grade);
        return true;
    }
}