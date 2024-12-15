package com.hostel_management_system.hostel.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hostel_management_system.hostel.Entity.Student;
import com.hostel_management_system.hostel.Services.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")        
public class StudentController {

    @Autowired
    private StudentService studentService;

    
    @GetMapping("getstudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("getstudentsbyid")
    public Student getStudentById(@PathVariable String studentId) {
        return studentService.getStudentById(studentId);
    }


    @PostMapping("addstudents")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

   
    @PutMapping("updatestudents")
    public Student updateStudent(@PathVariable String studentId, @RequestBody Student updatedStudent) {
        return studentService.updateStudent(studentId, updatedStudent);
    }

    @DeleteMapping("deletestudents")
    public String deleteStudent(@PathVariable String studentId) {
        studentService.deleteStudent(studentId);
        return "Student with ID " + studentId + " has been deleted.";
    }
}
