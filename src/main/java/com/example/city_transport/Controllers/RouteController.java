package com.example.city_transport.Controllers;

import com.example.city_transport.models.Route;
import com.example.city_transport.services.RouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
@RequiredArgsConstructor
public class RouteController {
    private final RouteService routeService;
    @GetMapping("/routes/{numberRoute}")
    public String routeInfoPage(@PathVariable int numberRoute, Model model){
        model.addAttribute("route", routeService.getRouteByNumberRoute(numberRoute));
        return "route-info";
    }
    @PostMapping("route/delete/{numberRoute}")
    public String delete(@PathVariable int numberRoute){
        routeService.deleteRoute(numberRoute);
        return "redirect:/routes";
    }
    @PostMapping("route/create")
    public String add(Route route){
        routeService.addRoute(route);
        return "redirect:/routes";
    }
}
