package com.example.city_transport.services;
import com.example.city_transport.models.Route;
import com.example.city_transport.repositories.RouteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class RouteService {
    private final RouteRepository routeRepository;
    public List<Route> routeList(){
        return routeRepository.findAll();
    }
    public Route getRouteByNumberRoute(int numberRoute){
        return routeRepository.findById(numberRoute).orElse(null);
    }
    public void deleteRoute(int numberRoute){
        routeRepository.deleteById(numberRoute);
    }
    public void addRoute(Route route){
        routeRepository.save(route);
    }
}
