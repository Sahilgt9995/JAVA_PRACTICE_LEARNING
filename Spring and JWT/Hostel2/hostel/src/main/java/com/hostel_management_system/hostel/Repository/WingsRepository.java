package com.hostel_management_system.hostel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel_management_system.hostel.Entity.Wings;

@Repository
public interface WingsRepository extends JpaRepository<Wings, String> {
    // Additional query methods if needed
}
