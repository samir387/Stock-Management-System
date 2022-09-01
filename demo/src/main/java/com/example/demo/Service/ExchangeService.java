package com.example.demo.Service;

import com.example.demo.Domain.Exchange;
import com.example.demo.Repository.ExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ExchangeService {
    @Autowired
    private ExchangeRepository exchangeRepository;

    public ResponseEntity<?> saveExchange(Exchange exchange) {
        return new ResponseEntity<>(exchangeRepository.save(exchange), HttpStatus.OK);
    }

    public ResponseEntity<?> getAllExchange() {
        return new ResponseEntity<>(exchangeRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<?> updateExchange(Exchange exchange) {
        return new ResponseEntity<>(exchangeRepository.save(exchange), HttpStatus.OK);
    }

    public ResponseEntity<?> deleteExchange(Long exchangeId) {
        exchangeRepository.deleteById(exchangeId);
        return new ResponseEntity<>("exchange deleted", HttpStatus.OK);
    }



}
