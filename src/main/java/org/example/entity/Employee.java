package org.example.entity;

import lombok.*;
import org.example.enums.EmployeeStatus;
import javax.persistence.*;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "employee")
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "phone")
    private String phone;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;
    @Column(name = "employee_type_id")
    private Integer employeeType_id;
}
