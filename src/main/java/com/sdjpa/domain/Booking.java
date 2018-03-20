package com.sdjpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "BOOKING")
public class Booking implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookingId;
    @Column
    private String psngrName;
    @Column
    private String departure;
    @Column
    private String destination;
    @Column
    private LocalDate travelDate;

}
