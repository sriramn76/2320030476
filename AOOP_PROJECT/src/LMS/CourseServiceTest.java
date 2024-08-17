package LMS;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;



public class CourseServiceTest {
    private CourseService courseService;
    private Instructor instructor;
    @Before
    public void setUp() {
        courseService = new CourseService();
        instructor = new Instructor("instructor1");
    }@Test
    public void testCreateCourseSuccess() {
        boolean created = courseService.createCourse("C001", "Math 101", "Basic Math Course", instructor);
        assertTrue(created);
    }

    
    
    @Test
    public void testCreateCourseFailureDuplicateId() {
        courseService.createCourse("C001", "Math 101", "Basic Math Course", instructor);
        boolean created = courseService.createCourse("C001", "Math 102", "Advanced Math Course", instructor);
        assertFalse(created);
    }

    @Test
    public void testCreateCourseFailureMissingField() {
        boolean created = courseService.createCourse(null, "Math 101", "Basic Math Course", instructor);
        assertFalse(created);
    }
}

class EnrollmentServiceTest {
    private EnrollmentService enrollmentService;
    private CourseService courseService;
    private User user;
    private Instructor instructor;

    		
    
    		@Before
    public void setUp() {
        enrollmentService = new EnrollmentService();
        courseService = new CourseService();
        user = new User("user1");
        instructor = new Instructor("instructor1");
        courseService.createCourse("C001", "Math 101", "Basic Math Course", instructor);
    }

    @Test
    public void testEnrollUserSuccess() {
        boolean enrolled = enrollmentService.enrollUser("C001", user);
        assertTrue(enrolled);
    }@Test
    public void testEnrollUserFailureNonExistentCourse() {
        boolean enrolled = enrollmentService.enrollUser("C999", user);
        assertFalse(enrolled);
    }
    
    

    @Test
    public void testEnrollUserFailureDuplicateEnrollment() {
        enrollmentService.enrollUser("C001", user);
        boolean enrolledAgain = enrollmentService.enrollUser("C001", user);
        assertFalse(enrolledAgain);
    }
}
class GradingServiceTest {
    private GradingService gradingService;
    private EnrollmentService enrollmentService;
    private CourseService courseService;
    private User user;
    private Instructor instructor;

    @Before
    public void setUp() {
        gradingService = new GradingService();
        enrollmentService = new EnrollmentService();
        courseService = new CourseService();
        user = new User("user1");
        instructor = new Instructor("instructor1");
        
        courseService.createCourse("C001", "Math 101", "Basic Math Course", instructor);
        enrollmentService.enrollUser("C001", user);
    }

    
    
    
    
    
    @Test
    public void testEnterGradeSuccess() {
        boolean graded = gradingService.enterGrade("C001", user, 85);
        assertTrue(graded);
    }@Test
    public void testEnterGradeFailureInvalidGrade() {
        boolean graded = gradingService.enterGrade("C001", user, 105); 
        assertFalse(graded);
    }
}

