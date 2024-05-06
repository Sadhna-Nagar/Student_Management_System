package Student.Dao;

import Student.Entity.Instructor;

public interface InstructorDao {
Instructor createInstructor(Instructor instructor);	
Instructor getInstructor(String instructorId);
}

