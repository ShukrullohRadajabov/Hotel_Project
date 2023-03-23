package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.ComplaintType;
import org.example.enums.OutComeType;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "out_come")
@Entity
public class OutCome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "outcome_type")
    @Enumerated(EnumType.STRING)
    private OutComeType outComeType;
}