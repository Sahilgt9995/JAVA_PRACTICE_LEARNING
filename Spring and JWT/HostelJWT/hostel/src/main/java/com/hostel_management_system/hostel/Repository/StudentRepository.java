package com.hostel_management_system.hostel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel_management_system.hostel.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    // Additional query methods if needed
}
