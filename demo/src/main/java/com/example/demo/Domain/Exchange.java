package com.example.demo.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Exchange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exchangeId;
    private String name;
    private String symbol;
    private String country;

    @OneToMany
    private List<Segments>segmentList;
}
