package Student.ServiceImpl;

import Student.Dao.CourseDao;
import Student.DaoImp.CourseDaoImpl;
import Student.Entity.Course;
import Student.Service.CourseService;

public class CourseServiceImpl implements CourseService{

	CourseDao courseDao=new CourseDaoImpl();
	
	@Override
	public Course createCourse(Course course) {
		return courseDao.createCourse(course);
	}

	@Override
	public Course getCourse(String courseID) {
		return courseDao.getCourse(courseID);
	}
	
}


