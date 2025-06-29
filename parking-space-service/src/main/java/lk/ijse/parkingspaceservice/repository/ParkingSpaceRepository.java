package lk.ijse.parkingspaceservice.repository;

import lk.ijse.parkingspaceservice.entity.ParkingSpace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, Long> {
}