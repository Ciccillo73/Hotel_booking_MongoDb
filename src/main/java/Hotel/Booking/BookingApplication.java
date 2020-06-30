package Hotel.Booking;

import Hotel.Booking.modules.Booking;
import Hotel.Booking.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookingApplication implements CommandLineRunner {

	@Autowired
	private BookingRepository bookingRepo;


	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		bookingRepo.deleteAll();

		//save a couple of booking
		bookingRepo.save(new Booking("Antonio Wuallera", "antoniounapallasola@gmail.com"));
		bookingRepo.save(new Booking("Mythicondrio Miti", "anto@gmail.com"));

		//print all bookings

		System.out.println("Booking found with findAll():");
		System.out.println("-----------------------------");
		for(Booking booking : bookingRepo.findAll()){
			System.out.println(booking);
		}
		System.out.println();
	}
}
