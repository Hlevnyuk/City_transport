package com.example.city_transport.services;
import com.example.city_transport.models.RoadRepair;
import com.example.city_transport.repositories.RoadRepairRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class RoadRepairService {
    private final RoadRepairRepository roadRepairRepository;
    public List<RoadRepair> roadRepairList(){
        return roadRepairRepository.findAll();
    }
    public void addRoadRepair(RoadRepair roadRepair){
        roadRepairRepository.save(roadRepair);
    }
    public void deleteRoadRepair(int id){
        roadRepairRepository.deleteById(id);
    }
}
