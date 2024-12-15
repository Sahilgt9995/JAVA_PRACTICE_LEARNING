package com.hostel_management_system.hostel.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel_management_system.hostel.Entity.Wings;
import com.hostel_management_system.hostel.Repository.WingsRepository;

import java.util.List;

@Service
public class WingsService {

    @Autowired
    private WingsRepository wingsRepository;

    public List<Wings> getAllWings() {
        return wingsRepository.findAll();
    }

    public Wings getWingById(String wingId) {
        return wingsRepository.findById(wingId)
                .orElseThrow(() -> new RuntimeException("Wing with ID " + wingId + " not found."));
    }
    public Wings addWing(Wings wing) {
        return wingsRepository.save(wing);
    }

    public Wings updateWing(String wingId, Wings updatedWing) {
        Wings existingWing = getWingById(wingId);
        existingWing.setWingName(updatedWing.getWingName());
        existingWing.setGenderAllowed(updatedWing.getGenderAllowed());
        existingWing.setCapacity(updatedWing.getCapacity());
        existingWing.setOccupied(updatedWing.getOccupied());
        return wingsRepository.save(existingWing);
    }

    public void deleteWing(String wingId) {
        if (wingsRepository.existsById(wingId)) {
            wingsRepository.deleteById(wingId);
        } else {
            throw new RuntimeException("Wing with ID " + wingId + " not found.");
        }
    }
}
