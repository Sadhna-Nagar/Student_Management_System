package Student.ServiceImpl;

import Student.Dao.InstructorDao;
import Student.DaoImp.InstructorDaoImpl;
import Student.Entity.Instructor;
import Student.Service.InstructorService;

public class InstructorServiceImpl implements InstructorService {

	InstructorDao instructorDao=new InstructorDaoImpl() ;
	
	
	@Override
	public Instructor createInstructor(Instructor instructor) {
		return instructorDao.createInstructor(instructor);
	}

	@Override
	public Instructor getInstructor(String instructorId) {
		return instructorDao.getInstructor(instructorId);
	}

}