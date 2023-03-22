package org.example.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "booking")
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "guest_id")
    private Integer guest_id;
    @Column(name = "room_id")
    private Integer room_id;
    @Column(name = "starting_date")
    private LocalDate startingDate;
    @Column(name = "during")
    private Integer during;
    @Column(name = "total_amount")
    private Double totalAmount;
}
