package com.example.city_transport.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@Table(name = "road_repair")
@AllArgsConstructor
@NoArgsConstructor
public class RoadRepair {
    @Id
    @Column(name = "id_roadrepair")
    private int id;
    @Column(name = "date_startroad")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateStartRoad;
    @Column(name = "date_endroad")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEndRoad;
}
