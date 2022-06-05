package com.example.city_transport.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@Table(name = "administrator")
@AllArgsConstructor
@NoArgsConstructor
public class Administrator {
    @Id
    @Column(name = "id_administrator")
    private int id;
    @Column(name = "surname")
    private String surname;
    @Column(name = "namee")
    private String name;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "email")
    private String email;
    @Column(name = "date_birth")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateBirth;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "password")
    private String password;
}
