package netgloo.util.parsing;

import org.modelmapper.ModelMapper;

import netgloo.dto.StudentDTO;
import netgloo.dao.entity.Student;

public class StudentParsing {

	public static StudentDTO parseToDTO(Student student) {

		ModelMapper modelMapper = new ModelMapper();
		StudentDTO studentDTO = modelMapper.map(student, StudentDTO.class);

		return studentDTO;
	}

	public static Student parseToEntity(StudentDTO studentDTO) {

		ModelMapper modelMapper = new ModelMapper();
		Student student = modelMapper.map(studentDTO, Student.class);

		return student;
	}
}
