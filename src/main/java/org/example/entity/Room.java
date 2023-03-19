package org.example.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.RoomType;
import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "room")
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "number")
    private Integer number;
    @Column(name = "floor")
    private Integer floor;
    @Column(name = "type")
    private RoomType type;
    @Column(name = "price")
    private Double price;
    @Column(name = "area")
    private String area;
}
