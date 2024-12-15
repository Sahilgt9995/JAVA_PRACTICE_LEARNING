package com.hostel_management_system.hostel.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel_management_system.hostel.Entity.Student;
import com.hostel_management_system.hostel.Entity.WingRoom;
import com.hostel_management_system.hostel.Repository.StudentRepository;
import com.hostel_management_system.hostel.Repository.WingRoomRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private WingRoomRepository wingRoomRepository;


    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

 
    public Student getStudentById(String studentId) {
        return studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student with ID " + studentId + " not found."));
    }


    public Student addStudent(Student student) {
        if (student.getWingRoom() != null) {
            Optional<WingRoom> wingRoomOpt = wingRoomRepository.findById(student.getWingRoom().getRoomId());
            wingRoomOpt.ifPresent(student::setWingRoom);
        }
        return studentRepository.save(student);
    }


    public Student updateStudent(String studentId, Student updatedStudent) {
        Student existingStudent = getStudentById(studentId);
        existingStudent.setName(updatedStudent.getName());
        existingStudent.setAge(updatedStudent.getAge());
        existingStudent.setGender(updatedStudent.getGender());
        existingStudent.setPhoneNumber(updatedStudent.getPhoneNumber());
        existingStudent.setEmail(updatedStudent.getEmail());
        existingStudent.setWingRoom(updatedStudent.getWingRoom());
        return studentRepository.save(existingStudent);
    }

    
    public void deleteStudent(String studentId) {
        if (studentRepository.existsById(studentId)) {
            studentRepository.deleteById(studentId);
        } else {
            throw new RuntimeException("Student with ID " + studentId + " not found.");
        }
    }
}
