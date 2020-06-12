package netgloo.service;

import java.util.List;

import netgloo.dto.StudentDTO;

public interface StudentService {

	List<StudentDTO> getStudents();

	void deleteStudent(Long id);

	StudentDTO showEditStudent(Long id);

	void saveStudent(StudentDTO studentDTO);
}
