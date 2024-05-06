package Student.Dao;

import Student.Entity.Course;
import Student.Entity.Student;

public interface CourseDao {
Course createCourse(Course course);	
Course getCourse(String courseID);
}


