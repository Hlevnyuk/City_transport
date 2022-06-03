package com.example.city_transport.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@Table(name = "trafic_jem")
@AllArgsConstructor
@NoArgsConstructor
public class TraficJem {
    @Id
    @Column(name = "id_trafic_jem")
    private int idTraficJem;
    @Column(name = "stop")
    private String stop;
    @Column(name = "date_traficjem")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTraficJem;
    @Column(name = "start_point")
    private String startPoint;
    @Column(name = "end_point")
    private String endPoint;
    @Column(name = "number_employee")
    private int numberEmployee;
    @Column(name = "number_stop")
    private int numberStop;
    @Column(name = "time_start")
    @Temporal(TemporalType.TIME)
    private Date timeStart;
    @Column(name = "time_final")
    @Temporal(TemporalType.TIME)
    private Date timeEnd;
    @Column(name = "extent")
    private int extent;
}
