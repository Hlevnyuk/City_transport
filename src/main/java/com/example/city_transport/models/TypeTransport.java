package com.example.city_transport.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Data
@Table(name = "type_transport")
@AllArgsConstructor
@NoArgsConstructor
public class TypeTransport {
    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "price_ticket")
    private int priceTicket;
    @Column(name = "kol_places")
    private int kolPlaces;
}
