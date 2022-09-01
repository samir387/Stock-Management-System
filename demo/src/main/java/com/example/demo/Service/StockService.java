package com.example.demo.Service;

import com.example.demo.Domain.Exchange;
import com.example.demo.Domain.Segments;
import com.example.demo.Domain.Stock;
import com.example.demo.Repository.ExchangeRepository;
import com.example.demo.Repository.SegmentRepository;
import com.example.demo.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;
    @Autowired
    private SegmentRepository segmentRepository;
    @Autowired
    private ExchangeRepository exchangeRepository;

    public ResponseEntity<?> saveStock(Stock stock) {
        return new ResponseEntity<>(stockRepository.save(stock), HttpStatus.OK);
    }

    public ResponseEntity<?> getAllStock() {
        return new ResponseEntity<>(stockRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<?> updateStock(Stock stock) {
        return new ResponseEntity<>(stockRepository.save(stock), HttpStatus.OK);
    }

    public ResponseEntity<?> deleteStock(Long stockId) {
        stockRepository.deleteById(stockId);
        return new ResponseEntity<>("stock deleted.", HttpStatus.OK);
    }

    public ResponseEntity<?> getStockBySegment(Long segmentsId) {
        Optional<Segments> segments = segmentRepository.findById(segmentsId);
        Stock stock = stockRepository.findBySegment(segments);
        return new ResponseEntity<>(stock, HttpStatus.OK);
    }

    public ResponseEntity<?> getStockByExchange(Long exchangeId) {
        Optional<Exchange> exchange = exchangeRepository.findById(exchangeId);
        List<Stock> stock = stockRepository.findByExchange(exchange.get());
        return new ResponseEntity<>(stock, HttpStatus.OK);
    }

    public ResponseEntity<?> getStockByType(String type) {
        Stock stock = stockRepository.findByType(type);
        return new ResponseEntity<>(stock, HttpStatus.OK);
    }

    public ResponseEntity<?> getStockByCountry(String country) {
        Exchange exchange = exchangeRepository.findByCountry(country);
        List<Stock> stockList = stockRepository.findByExchange(exchange);
        return new ResponseEntity<>(stockList, HttpStatus.OK);
    }


}
