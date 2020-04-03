package io.cx.controllers

import java.net.URL
import java.net.HttpURLConnection
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;

import io.cx.model.Student
import io.cx.services.StudentService

@RestController
@RequestMapping(value = "/api")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(path="/test", method = [RequestMethod.GET])
	public String TestAPI(@RequestHeader HttpHeaders headers) {
		//System.out.println("Testing API 1 ...")
		return "tests"
	}
	
	@RequestMapping(path="/springmvc/add/{studentname}", method = [RequestMethod.POST])
	public String addStudent(@PathVariable(value="studentname") String studentname,
		@RequestBody(required = false)  Map wfInput,@RequestHeader HttpHeaders headers) {
		//System.out.println("Testing API ...")
		Student student = new Student()
		student.setName(studentname)
		
		studentService.saveStudent(student)
		
		return "SUCCESS"
	}
	
	@RequestMapping(path="/springmvc/get/{studentid}", method = [RequestMethod.GET])
	public String getStudent(@PathVariable(value="studentid") String studentid,@RequestHeader HttpHeaders headers) {
		
		ObjectId sID = new ObjectId(studentid)
		//Student student = studentService.geStudentFromId(sID)
		//if(null != student) {
	//		return "STUDENT found"
		//}
		return "STUDENT not found"
	}
	
	@RequestMapping(path="/springmvc/getall", method = [RequestMethod.GET])
	public List<Student> getStudents(@RequestHeader HttpHeaders headers) {
		List<Student> students = studentService.getStudents()
		if(null != students) {
			//System.out.println( "STUDENT list found")
			return students
		}
		//System.out.println( "STUDENT list not found")
		return null
	}
}
