package lk.ijse.parkingspaceservice.repository;

import lk.ijse.parkingspaceservice.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}