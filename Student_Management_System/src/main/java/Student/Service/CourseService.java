package Student.Service;

import Student.Entity.Course;

public interface CourseService {
	Course createCourse(Course course);	
	Course getCourse(String courseID);
}

