package com.hostel_management_system.hostel.Entity;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "wings")
public class Wings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wing_id")
    private String wingId;

    @Column(name = "wing_name")
    private String wingName;

    @Column(name = "gender_allowed")
    private String genderAllowed;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "occupied")
    private int occupied;

    @OneToMany(mappedBy = "wing", cascade = CascadeType.ALL)
    private List<WingRoom> wingRooms;
    @JsonManagedReference
    public String getWingId() {
        return wingId;
    }

    public void setWingId(String wingId) {
        this.wingId = wingId;
    }

    public String getWingName() {
        return wingName;
    }

    public void setWingName(String wingName) {
        this.wingName = wingName;
    }

    public String getGenderAllowed() {
        return genderAllowed;
    }

    public void setGenderAllowed(String genderAllowed) {
        this.genderAllowed = genderAllowed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getOccupied() {
        return occupied;
    }

    public void setOccupied(int occupied) {
        this.occupied = occupied;
    }

    public List<WingRoom> getWingRooms() {
        return wingRooms;
    }

    public void setWingRooms(List<WingRoom> wingRooms) {
        this.wingRooms = wingRooms;
    }
}
