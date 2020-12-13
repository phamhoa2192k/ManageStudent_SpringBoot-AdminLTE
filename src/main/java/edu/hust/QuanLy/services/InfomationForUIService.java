package edu.hust.QuanLy.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.hust.QuanLy.entities.Classroom;

@Service
public interface InfomationForUIService {
    List<Classroom> getAllClassrooms();
}
