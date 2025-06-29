package lk.ijse.parkingspaceservice.controller;

import lk.ijse.parkingspaceservice.dto.BookingDTO;
import lk.ijse.parkingspaceservice.dto.PaymentDTO;
import lk.ijse.parkingspaceservice.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/booking")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @GetMapping
    public ResponseEntity<List<BookingDTO>> getAllBookings() {
        return ResponseEntity.ok(bookingService.getAllBookings());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookingDTO> getBookingById(@PathVariable Long id) {
        BookingDTO booking = bookingService.getBookingById(id);
        if (booking == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(booking);
    }

    @PostMapping
    public ResponseEntity<BookingDTO> createBooking(@RequestBody BookingDTO bookingDTO) {

        bookingDTO.setStartTime(LocalDateTime.now());
        bookingDTO.setCreatedAt(LocalDateTime.now());

        return ResponseEntity.ok(bookingService.createBooking(bookingDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookingDTO> updateBooking(@PathVariable Long id, @RequestBody BookingDTO bookingDTO) {
        BookingDTO updatedBooking = bookingService.updateBooking(id, bookingDTO);
        if (updatedBooking == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedBooking);
    }


    @GetMapping("closeBooking/{id}")
    public ResponseEntity<PaymentDTO> closeBooking(@PathVariable Long id) {
        PaymentDTO paymentDTO = bookingService.closeBooking(id);
        if (paymentDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(paymentDTO);
    }


}