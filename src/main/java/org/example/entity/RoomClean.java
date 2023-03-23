package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.Work_Shift;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "room_clean")
@Entity
public class RoomClean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "employee_id")
    private Integer employee_id;
    @Column(name = "clean_time")
    @Enumerated(EnumType.STRING)
    private Work_Shift workShift;
    @Column(name = "room_id")
    private Integer roomId;
}
