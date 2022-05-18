package src.main.java.ee.student.veebileht.controller;

import src.main.java.ee.student.veebileht.model.Student;
import src.main.java.ee.student.veebileht.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("students") //localhost:8080/products GET
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
    @GetMapping("students/{index}") //localhost:8080/products/1 GET
    public Student getStudent(@PathVariable Long index) {
        return studentRepository.findById(index).get();
    }

    @DeleteMapping("students/{index}") //localhost:8080/products/1 DELETE
    public List<Student> deleteStudent(@PathVariable Long index) {
        studentRepository.deleteById(index);
        return studentRepository.findAll();
    }

    @DeleteMapping("students") //localhost:8080/products DELETE
    public String deleteStudent() {
        studentRepository.deleteAll();
        return "Kõik tooted kustutatud";
    }

    @PostMapping("students") //localhost:8080/products POST
    public void addStudent(@RequestBody Student student) {
        studentRepository.save(student);

    }

    @PutMapping("students/{index}") //localhost:8080/products PUT
    public void editStudent(@PathVariable int index,@RequestBody Student student) {
        studentRepository.save(student);

    }

    @PostMapping("add-all-students") //localhost:8080/add-all-products POST
    public void addAllStudents(@RequestBody List<Student> students) {
        studentRepository.saveAll(students);

    }
}
