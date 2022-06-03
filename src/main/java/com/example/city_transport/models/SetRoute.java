package com.example.city_transport.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Data
@Table(name = "setroute")
@AllArgsConstructor
@NoArgsConstructor
public class SetRoute {
    @Column(name = "number_route")
    private int numberRoute;
    @Column(name = "id_transport")
    private int idTransport;
}
