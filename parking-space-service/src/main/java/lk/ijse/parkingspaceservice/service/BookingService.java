package lk.ijse.parkingspaceservice.service;



import lk.ijse.parkingspaceservice.dto.BookingDTO;
import lk.ijse.parkingspaceservice.dto.PaymentDTO;

import java.util.List;

public interface BookingService {
    List<BookingDTO> getAllBookings();
    BookingDTO getBookingById(Long id);
    BookingDTO createBooking(BookingDTO bookingDTO);
    void deleteBooking(Long id);

    BookingDTO updateBooking(Long id, BookingDTO bookingDTO);

    PaymentDTO closeBooking(Long id);
}