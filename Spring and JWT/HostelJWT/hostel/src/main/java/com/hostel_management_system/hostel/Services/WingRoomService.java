package com.hostel_management_system.hostel.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel_management_system.hostel.Entity.WingRoom;
import com.hostel_management_system.hostel.Repository.WingRoomRepository;

import java.util.List;

@Service
public class WingRoomService {

    @Autowired
    private WingRoomRepository wingRoomRepository;

    public List<WingRoom> getAllRooms() {
        return wingRoomRepository.findAll();
    }

    public WingRoom getRoomById(String roomId) {
        return wingRoomRepository.findById(roomId)
                .orElseThrow(() -> new RuntimeException("Room with ID " + roomId + " not found."));
    }

    public WingRoom addRoom(WingRoom wingRoom) {
        return wingRoomRepository.save(wingRoom);
    }

    public WingRoom updateWingRoom(String roomId, WingRoom updatedWingRoom) {
        WingRoom existingRoom = getRoomById(roomId);
        existingRoom.setRoomNumber(updatedWingRoom.getRoomNumber());
        existingRoom.setCapacity(updatedWingRoom.getCapacity());
        existingRoom.setOccupied(updatedWingRoom.getOccupied());
        existingRoom.setWing(updatedWingRoom.getWing());
        return wingRoomRepository.save(existingRoom);
    }

    public void deleteRoom(String roomId) {
        if (wingRoomRepository.existsById(roomId)) {
            wingRoomRepository.deleteById(roomId);
        } else {
            throw new RuntimeException("Room with ID " + roomId + " not found.");
        }
    }
}
