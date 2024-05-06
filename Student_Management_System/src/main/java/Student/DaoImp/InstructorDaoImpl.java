package Student.DaoImp;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import Student.Dao.InstructorDao;
import Student.Entity.Instructor;
import Student.Util.HibernateUtil;


public  class InstructorDaoImpl implements InstructorDao{

	@Override
	public Instructor createInstructor(Instructor instructor) {
	try(Session session=HibernateUtil.getSession()) {
			
			session.beginTransaction();
			session.save(instructor);
			session.getTransaction().commit();
			return instructor;
			
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
	public Instructor getInstructor(String instructorId) {
		try(Session session=HibernateUtil.getSession()) {
			
			Instructor instructor=session.get(Instructor.class, instructorId);
				return instructor;
				
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
