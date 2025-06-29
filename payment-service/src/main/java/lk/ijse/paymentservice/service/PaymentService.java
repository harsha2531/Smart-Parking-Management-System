package lk.ijse.paymentservice.service;

import lk.ijse.paymentservice.dto.PaymentDTO;
import lk.ijse.paymentservice.dto.PaymentRequestDTO;

import java.util.UUID;

public interface PaymentService {
    PaymentDTO getByBookingId(UUID bookingId);
    PaymentDTO processPayment(PaymentRequestDTO request);
}
