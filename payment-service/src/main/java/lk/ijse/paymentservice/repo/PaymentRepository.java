package lk.ijse.paymentservice.repo;

import lk.ijse.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment, String> {
    Optional<Payment> findByBookingId(UUID bookingId);
}
