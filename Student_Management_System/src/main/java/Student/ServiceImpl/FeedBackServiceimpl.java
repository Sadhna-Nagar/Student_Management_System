package Student.ServiceImpl;

import Student.Dao.FeedBackDao;
import Student.DaoImp.FeedBackDaoImpl;
import Student.Entity.FeedBack;
import Student.Entity.Student;
import Student.Service.FeedBackService;

public class FeedBackServiceimpl implements FeedBackService {

	FeedBackDao feedBackDao=new FeedBackDaoImpl(); 
	
	@Override
	public Student getStudent(String studentID) {
		
		return feedBackDao.getStudent(studentID);
	}

	@Override
	public FeedBack createFeedback(FeedBack feedback) {
		return feedBackDao.createFeedback(feedback);
	}

}
