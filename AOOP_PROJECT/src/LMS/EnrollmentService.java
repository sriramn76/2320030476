package LMS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EnrollmentService {
    private Map<String, Set<User>> enrollments = new HashMap<>();

    public boolean enrollUser(String courseId, User user) {
        if (!enrollments.containsKey(courseId)) {
            enrollments.put(courseId, new HashSet<User>());
        }
        Set<User> enrolledUsers = enrollments.get(courseId);
        return enrolledUsers.add(user);
    }
}