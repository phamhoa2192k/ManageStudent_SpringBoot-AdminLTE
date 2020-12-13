package edu.hust.QuanLy.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hust.QuanLy.entities.Classroom;
import edu.hust.QuanLy.repositories.ClassroomRepository;
import edu.hust.QuanLy.services.InfomationForUIService;

@Service
public class InfomationForUIServiceImp implements InfomationForUIService {
    @Autowired
    private ClassroomRepository classroomRepository;

    @Override
    public List<Classroom> getAllClassrooms(){
        return classroomRepository.findAll();
    }
}
    

