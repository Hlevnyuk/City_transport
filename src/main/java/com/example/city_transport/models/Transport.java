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
@Table(name = "transport")
@AllArgsConstructor
@NoArgsConstructor
public class Transport {
    @Id
    @Column(name = "id_transport")
    private int idTransport;
    @Column(name = "id_contract")
    private int idContract;
    @Column(name = "number_transport")
    private int numberTransport;
    @Column(name = "type_transport")
    private String typeTransport;
    @Column(name = "garage")
    private String garage;
}
