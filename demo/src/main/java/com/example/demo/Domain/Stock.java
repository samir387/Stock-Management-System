package com.example.demo.Domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockId;
    private String symbol;
    private String industry;
    private  String type;
    private Float currentPrice;
    private LocalDate expiryDate;
    private Integer lotSize;

    @OneToOne
    private Exchange exchange;

    @OneToOne
    private Segments segment;
}
