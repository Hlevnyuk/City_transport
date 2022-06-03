package com.example.city_transport.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Table(name = "road_repaironstop")
@AllArgsConstructor
@NoArgsConstructor
public class RoadRepairOnStop {
    @Column(name = "id_road_repaironstop")
    private int idRepairOnStop;
    @Column(name = "number_stop")
    private int numberStop;
}
