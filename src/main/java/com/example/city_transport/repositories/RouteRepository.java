package com.example.city_transport.repositories;
import com.example.city_transport.models.Route;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RouteRepository extends JpaRepository<Route, Integer> {
}
