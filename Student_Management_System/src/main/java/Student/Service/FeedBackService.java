package Student.Service;


import Student.Entity.FeedBack;
import Student.Entity.Student;

	public interface FeedBackService {
		Student getStudent(String studentID);
		FeedBack createFeedback(FeedBack feedback);
	}

