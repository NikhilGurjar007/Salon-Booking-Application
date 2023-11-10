package com.nikhil.salonbooking.data;

import com.nikhil.salonbooking.domain.BarberDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberRepository extends MongoRepository<BarberDetails, String> {
    BarberDetails findById(long id);
}


// @Repository:
// This annotation is like telling Spring, "Hey, treat this interface as a repository. It's a special place where we store and retrieve objects from the database." It's part of the Spring framework.
// public interface BarberRepository:

// This declares an interface named BarberRepository. An interface in Java is like a contract. Here, it's saying, "Any class that implements this interface must provide certain methods, thanks to extending MongoRepository."
// extends MongoRepository<BarberDetails, String>:

// This is where the magic happens. MongoRepository is an interface provided by Spring Data for MongoDB. By extending it, your BarberRepository inherits a set of ready-made methods for common MongoDB operations.

// BarberDetails:
// It specifies the type of objects (documents in MongoDB) that this repository will deal with. In this case, it's BarberDetails.
// String:
// It specifies the type of the identifier (@Id field in BarberDetails). Here, it's saying, "The identifier is a String."
// // additional methods or custom queries can be added here:

// This is a comment indicating that you can add additional methods or custom queries to this interface. These are methods that go beyond the basic ones provided by MongoRepository. You can define methods here to suit your specific needs.
