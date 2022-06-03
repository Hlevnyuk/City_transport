package com.example.city_transport.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@Table(name = "ticket_sold")
@AllArgsConstructor
@NoArgsConstructor
public class TicketSold {
    @Id
    @Column(name = "id_transport")
    private int idTransport;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSold;
    @Column(name = "kol_ticket_sold")
    private int kolTicketSold;
}
