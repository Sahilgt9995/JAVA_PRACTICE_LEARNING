package com.hostel_management_system.hostel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.hostel_management_system.hostel.Entity.Wings;
import com.hostel_management_system.hostel.Services.WingsService;

import java.util.List;

@RestController
@RequestMapping("/wings")
public class WingsController {

    @Autowired
    private WingsService wingsService;

    @GetMapping("getwings")
    public String getAllWings(Model model) {
        List<Wings> wingsList = wingsService.getAllWings();
        model.addAttribute("wingsList", wingsList);
        return "wings";
    }
    
    @GetMapping("getwingsbyid")
    public Wings getWingById(@PathVariable String wingId) {
        return wingsService.getWingById(wingId);
    }

    @PostMapping("addwings")
    public Wings addWing(@RequestBody Wings wing) {
        return wingsService.addWing(wing);
    }

    @PutMapping("updatewings")
    public Wings updateWing(@PathVariable String wingId, @RequestBody Wings updatedWing) {
        return wingsService.updateWing(wingId, updatedWing);
    }

    @DeleteMapping("deletewings")
    public String deleteWing(@PathVariable String wingId) {
        wingsService.deleteWing(wingId);
        return "Wing with ID " + wingId + " has been deleted.";
    }
}
