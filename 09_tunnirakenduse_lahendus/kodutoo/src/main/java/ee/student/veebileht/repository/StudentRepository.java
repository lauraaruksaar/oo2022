package src.main.java.ee.student.veebileht.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import src.main.java.ee.student.veebileht.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
