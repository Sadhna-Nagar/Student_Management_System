package Student.DaoImp;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import Student.Dao.CourseDao;
import Student.Entity.Course;
import Student.Util.HibernateUtil;



public class CourseDaoImpl implements CourseDao {

	@Override
	public Course createCourse(Course course) {
	
			try(Session session=HibernateUtil.getSession()) {
				
				session.beginTransaction();
				session.save(course);
				session.getTransaction().commit();
				return course;
				
			}
			catch (HibernateException e) {
				System.out.println(e);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			
			return null;
		}

	@Override
	public Course getCourse(String courseID) {
		try(Session session=HibernateUtil.getSession()) {
			
			Course course=session.get(Course.class, courseID);
				return course;
				
			}
			catch (HibernateException e) {
				System.out.println(e);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		return null;
	}


}