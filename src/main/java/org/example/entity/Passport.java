package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "guest_passport")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "number")
    private String number;
    @Column(name = "given_time")
    private LocalDate givenTime;
    @Column(name = "validity_period")
    private LocalDate validityPeriod;
    @Column(name = "given_organ")
    private String givenOrgan;
    @Column(name = "given_area")
    private String givenArea;
}
