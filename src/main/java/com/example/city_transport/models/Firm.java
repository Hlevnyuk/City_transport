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
@Table(name = "firm")
@AllArgsConstructor
@NoArgsConstructor
public class Firm {
    @Id
    @Column(name = "name_firm")
    private String nameFirm;
    @Column(name = "email")
    private String email;
    @Column(name = "adres")
    private String address;
    @Column(name = "telephone")
    private String phoneNumber;
}
