package netgloo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import netgloo.dto.StudentDTO;
import netgloo.service.StudentService;

@Controller
public class ControllerStudent {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/")
	public String welcome(ModelMap model) {

		model.addAttribute("data", studentService.getStudents());

		return "welcome";
	}

	@GetMapping("/add")
	public String showAddStudent() {

		return "addForm";
	}

	@PostMapping("/add")
	public String addStudent(ModelMap model, StudentDTO studentDTO) {

		studentService.saveStudent(studentDTO);
		model.addAttribute("data", studentService.getStudents());

		return "welcome";
	}

	@GetMapping("/delete")
	public String deleteStudent(ModelMap model, @ModelAttribute("id") Long id) {

		studentService.deleteStudent(id);
		model.addAttribute("data", studentService.getStudents());

		return "welcome";
	}

	@GetMapping("/edit")
	public String showEditStudent(ModelMap model, @ModelAttribute("id") Long id) {

		model.addAttribute("data", studentService.showEditStudent(id));

		return "editForm";
	}

	@PostMapping("/edit")
	public String editStudent(ModelMap model,StudentDTO studentDTO) {

		studentService.saveStudent(studentDTO);
		model.addAttribute("data", studentService.getStudents());

		return "welcome";
	}
}