package lk.ijse.parkingspaceservice.dto;

import lk.ijse.parkingspaceservice.util.Status;
import lombok.Data;

@Data
public class ParkingSpaceDTO {
    private Long id;
    private ParkingZoneDTO zone;
    private String locationDescription;
    private Status status;
}