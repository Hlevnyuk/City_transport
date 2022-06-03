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
@Table(name = "stop")
@AllArgsConstructor
@NoArgsConstructor
public class Stop {
    @Id
    @Column(name = "number_stop")
    private int numberStop;
    @Column(name = "adres")
    private String address;
}
