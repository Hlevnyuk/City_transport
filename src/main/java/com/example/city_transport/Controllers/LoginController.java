package com.example.city_transport.Controllers;
import com.example.city_transport.configurations.CreateConnection;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
@Controller
@RequiredArgsConstructor
public class LoginController {
    private final DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
    List<Connection> createdConnections = new ArrayList<>();
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/")
    public String authorization(@RequestParam String name, @RequestParam String password) throws SQLException {
        driverManagerDataSource.setUrl("jdbc:postgresql://localhost:5432/CityTransport");
        createdConnections.add(driverManagerDataSource.getConnection(name, password));
        System.out.println(createdConnections.toString() + "\n");
        //createConnection.setUsername(name);
        //createConnection.setPassword(password);
        //createConnection.getDataSource().getConnection();
        //System.out.println(createConnection.getUsername());
        //System.out.println(createConnection.getPassword());
        return "main";
    }
    @PostMapping("/logout")
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() throws SQLException {
        driverManagerDataSource.setUrl("jdbc:postgresql://localhost:5432/CityTransport");
        return "main";
    }
}
