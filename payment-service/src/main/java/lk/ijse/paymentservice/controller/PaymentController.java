package lk.ijse.paymentservice.controller;


import lk.ijse.paymentservice.dto.PaymentDTO;
import lk.ijse.paymentservice.dto.PaymentRequestDTO;
import lk.ijse.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/pay")
    public PaymentDTO makePayment(@RequestBody PaymentRequestDTO request) {
        return paymentService.processPayment(request);
    }

    @GetMapping("/booking/{bookingId}")
    public PaymentDTO getPaymentByBooking(@PathVariable String bookingId) {
        return paymentService.getByBookingId(UUID.fromString(bookingId));
    }
}
