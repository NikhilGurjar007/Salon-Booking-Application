package com.nikhil.salonbooking.data;

import com.nikhil.salonbooking.domain.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends MongoRepository<Booking, String> {
   List<Booking> findByBarberId(long barberId);
}
