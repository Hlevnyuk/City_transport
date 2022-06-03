package com.example.city_transport.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@Table(name = "contract")
@AllArgsConstructor
@NoArgsConstructor
public class Contract {
    @Id
    @Column(name = "id_contract")
    private int id;
    @Column(name = "firm")
    private String firm;
    @Column(name = "datee")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateStartContract;
    @Column(name = "validity")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEndContract;
}
