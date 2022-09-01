package com.example.demo.Repository;

import com.example.demo.Domain.Exchange;
import com.example.demo.Domain.Segments;
import com.example.demo.Domain.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock,Long> {
    Stock findBySegment(Optional<Segments> segments);
    List<Stock> findByExchange(Exchange exchange);
    Stock findByType(String type);
}
