package Hotel.Booking.repositories;

import Hotel.Booking.modules.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking, String> {
}
