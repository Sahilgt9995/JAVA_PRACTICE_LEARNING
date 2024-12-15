package com.hostel_management_system.hostel.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.hostel_management_system.hostel.Entity.WingRoom;
import com.hostel_management_system.hostel.Services.WingRoomService;

import java.util.List;

@RestController
@RequestMapping("/wingRooms")
public class WingRoomController {

    @Autowired
    private WingRoomService wingRoomService;

    @GetMapping("getwingrooms")
    public String getAllWingRooms(Model model) {
        List<WingRoom> wingRoomsList = wingRoomService.getAllRooms();
        model.addAttribute("wingRoomsList", wingRoomsList);
        return "wingrooms";
    }

    @GetMapping("getwingroomsbyid")
    public WingRoom getRoomById(@PathVariable String roomId) {
        return wingRoomService.getRoomById(roomId);
    }

    @PostMapping("addwingrooms")
    public WingRoom addRoom(@RequestBody WingRoom wingRoom) {
        return wingRoomService.addRoom(wingRoom);
    }

    @PutMapping("updatewingrooms")
    public WingRoom updateRoom(@PathVariable String roomId, @RequestBody WingRoom updatedWingRoom) {
        return wingRoomService.updateWingRoom(roomId, updatedWingRoom);
    }

    @DeleteMapping("deletewingrooms")
    public String deleteRoom(@PathVariable String roomId) {
        wingRoomService.deleteRoom(roomId);
        return "Room with ID " + roomId + " has been deleted.";
    }
}
