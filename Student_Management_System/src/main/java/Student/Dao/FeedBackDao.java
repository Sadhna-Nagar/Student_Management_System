package Student.Dao;

import Student.Entity.FeedBack;
import Student.Entity.Student;

public interface FeedBackDao {

 Student getStudent(String studentID);
FeedBack createFeedback(FeedBack feedback);
}
