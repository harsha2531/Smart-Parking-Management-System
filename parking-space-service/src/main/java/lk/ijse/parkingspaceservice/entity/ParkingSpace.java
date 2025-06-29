// Updated ParkingSpace.java
package lk.ijse.parkingspaceservice.entity;

import jakarta.persistence.*;
import lk.ijse.parkingspaceservice.util.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ParkingZone zone;
    private String locationDescription;
    @Enumerated(EnumType.STRING)
    private Status status = Status.AVAILABLE;
}