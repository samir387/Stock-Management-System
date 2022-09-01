package com.example.demo.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Segments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long segmentId;

    @Column(unique = true)
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String workingDay;


    @ManyToOne
    private Exchange exchange;
}

