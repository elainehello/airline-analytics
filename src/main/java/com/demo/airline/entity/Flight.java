package com.demo.airline.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

@Entity
@Table(name = "flights")
@Getter
@Setter
@NoArgsConstructor // empty constructor
@AllArgsConstructor // constructor with all fields
@Builder
public class Flight {
    /**
     * Entity class representing a flight in the airline system.
     * This class is annotated with JPA annotations to map it to a database table.
     *      - @Entity: Specifies that the class is an entity and is mapped to a database table.
     *      - @Table: Specifies the name of the database table to be used for mapping.
     *      - @Id: Specifies the primary key of the entity.
     *      - @GeneratedValue: Specifies the generation strategy for the primary key.
     *  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String flightNumber;

    private String airline;

    private String origin;

    private String destination;

    private int delayMinutes;
}
