package com.example.city_transport.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@Table(name = "route")
@AllArgsConstructor
@NoArgsConstructor
public class Route {
    @Id
    @Column(name = "number_route")
    private int numberRoute;
    @Column(name = "start_point")
    private String startPoint;
    @Column(name = "end_point")
    private String endPoint;
    @Column(name = "number_ofstops")
    private int numberOfStops;
    @Column(name = "interv")
    private String interval;
    @Column(name = "datetime")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateTime;
    @Column(name = "id_administrator")
    private String idAdministrator;
}
