package com.example.city_transport.Controllers;

import com.example.city_transport.models.RoadRepair;
import com.example.city_transport.services.RoadRepairService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class RoadRepairController {
    private final RoadRepairService roadRepairService;
    @GetMapping("/roadRepair/{id}")
    public String roadRepairPageInfo(@PathVariable int id, Model model){
        model.addAttribute("roadRepair", roadRepairService.roadRepairList());
        return "roadRepair";
    }
    @PostMapping("/roadRepair/create")
    public String addRoadRepair(RoadRepair roadRepair){
        roadRepairService.addRoadRepair(roadRepair);
        return "redirect:/roadRepair";
    }
    @PostMapping("/roadRepair/delete/{id}")
    public String deleteRoadRepair(@PathVariable int id){
        roadRepairService.deleteRoadRepair(id);
        return "redirect:/roadRepair";
    }
}
