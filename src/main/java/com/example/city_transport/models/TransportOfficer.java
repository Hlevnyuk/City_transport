package com.example.city_transport.models;

import com.example.city_transport.composite.CompositeKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@Table(name = "transport_officer")
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CompositeKey.class)
public class TransportOfficer {
    @Id
    @Column(name = "email")
    private String email;
    @Id
    @Column(name = "number_employee")
    private int numberEmployee;
    @Column(name = "surname")
    private String surname;
    @Column(name = "namee")
    private String name;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "post")
    private String post;
    @Column(name = "date_birth")
    private Date dateBirth;
    @Column(name = "adress")
    private String address;
}
