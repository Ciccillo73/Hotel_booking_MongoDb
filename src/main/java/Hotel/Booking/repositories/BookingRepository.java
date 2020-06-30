package Hotel.Booking.repositories;

import Hotel.Booking.modules.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookingRepository extends MongoRepository<Booking, String> {


    public List<Booking> findByName(String name);
    public List<Booking> findByEmail(String email);
    public List<Booking> findByCheckedTrue();
    public List<Booking> findByCheckedFalse();

}
