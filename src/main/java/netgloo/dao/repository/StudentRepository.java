package netgloo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import netgloo.dao.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
