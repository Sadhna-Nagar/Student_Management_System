package Student.Dao;

import java.util.List;

import Student.Entity.Enrollment;
import Student.Entity.Student;



public interface StudentDao {

Student createStudent(Student student);	
List<Student> getAllStudents();
Enrollment StudentEnrollment(Enrollment enrollment);
Student getStudent(String studentID);
List<Enrollment> getEnrollmentDetailsByCourseId(String courseId);
Student updateStudent(String studentID,Student updatedStudent);
String deleteStudent(String studentID);
}
