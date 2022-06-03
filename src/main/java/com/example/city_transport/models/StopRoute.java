package com.example.city_transport.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Data
@Table(name = "stop_route")
@AllArgsConstructor
@NoArgsConstructor
public class StopRoute {
    @Column(name = "number_route")
    private int numberRoute;
    @Column(name = "number_stop")
    private int numberStop;
}
