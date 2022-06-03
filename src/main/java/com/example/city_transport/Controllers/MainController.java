package com.example.city_transport.Controllers;
import com.example.city_transport.models.Route;
import com.example.city_transport.repositories.RouteRepository;
import com.example.city_transport.services.RoadRepairService;
import com.example.city_transport.services.RouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequiredArgsConstructor
public class MainController {
    private final RouteService routeService;
    private final RoadRepairService roadRepairService;
    @GetMapping("/")
    public String mainPage(){
        return "main";
    }
    @GetMapping("/routes")
    public String routePage(Model model){
        model.addAttribute("route", routeService.routeList());
        return "routes";
    }
    @GetMapping("/roadRepair")
    public String roadRepairPage(Model model){
        model.addAttribute("roadRepair", roadRepairService.roadRepairList());
        return "roadRepair";
    }
}
