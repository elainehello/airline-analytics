package com.demo.airline.repository;

import com.demo.airline.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
     /**
      * Repository interface for managing Flight entities.
      * This interface extends JpaRepository, which provides CRUD operations and pagination support.
      * The generic parameters specify the type of the entity (Flight) and the type of its primary key (Long).
      * By extending JpaRepository, we can perform various database operations on Flight entities without needing to write any implementation code.
      * JpaRepository provides methods such as save(), findById(), findAll(), deleteById(), and many more for managing entities in the database.
      */

     List<Flight> findByDelayMinutesGreaterThan(int delay);
}
