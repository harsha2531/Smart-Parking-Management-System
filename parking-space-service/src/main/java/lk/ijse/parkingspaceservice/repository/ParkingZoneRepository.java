package lk.ijse.parkingspaceservice.repository;

import lk.ijse.parkingspaceservice.entity.ParkingZone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingZoneRepository extends JpaRepository<ParkingZone, Long> {
}