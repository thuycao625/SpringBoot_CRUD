package netgloo.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import netgloo.dto.StudentDTO;
import netgloo.dao.entity.Student;
import netgloo.dao.repository.StudentRepository;
import netgloo.service.StudentService;
import netgloo.util.parsing.StudentParsing;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<StudentDTO> getStudents() {
		List<Student> students = studentRepository.findAll();
		List<StudentDTO> studentDTO = new ArrayList<>();
		for (Student student : students) {
			studentDTO.add(StudentParsing.parseToDTO(student));
		}
		return studentDTO;
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}

	@Override
	public void saveStudent(StudentDTO studentDTO) {
		studentRepository.saveAndFlush(StudentParsing.parseToEntity(studentDTO));
	}

	@Override
	public StudentDTO showEditStudent(Long id) {
		return StudentParsing.parseToDTO(studentRepository.getOne(id));
	}
}
