package Student.DaoImp;

import org.hibernate.HibernateException;
import org.hibernate.Session;


import Student.Dao.FeedBackDao;
import Student.Entity.FeedBack;
import Student.Entity.Student;
import Student.Util.HibernateUtil;

public   class FeedBackDaoImpl implements FeedBackDao{

	@Override
	public Student getStudent(String studentID) {
	try(Session session=HibernateUtil.getSession()) {
			
		Student student=session.get(Student.class, studentID);
			return student;
			
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
	public FeedBack createFeedback(FeedBack feedback) {
		
		try(Session session=HibernateUtil.getSession()) {
			
			session.beginTransaction();
			session.save(feedback);
			session.getTransaction().commit();
			return feedback;
			
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

