package com.nikhil.salonbooking.service;

import com.nikhil.salonbooking.domain.BarberDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BarberService {
    BarberDetails registerBarberDetails(BarberDetails barberDetails);
    List<BarberDetails> getBarberAllRecords();
    BarberDetails getBarberRecord(long id);
}
