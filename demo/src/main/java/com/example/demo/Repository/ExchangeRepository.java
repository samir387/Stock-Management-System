package com.example.demo.Repository;

import com.example.demo.Domain.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRepository extends JpaRepository<Exchange,Long> {

    Exchange findByCountry(String country);
}
