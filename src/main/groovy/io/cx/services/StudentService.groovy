package io.cx.services

import org.bson.types.ObjectId
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import io.cx.model.baseStudent
import io.cx.dao.StudentRepo

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	//public baseStudent getStudentFromId(ObjectId id) {
	//	return studentRepo.findByCxId(id).orElse(null)
	//}
	
	public void saveStudent(baseStudent student) {
		studentRepo.save(student)
	}

	public List<baseStudent> getStudents() {
		return studentRepo.findAll()
	}
}
