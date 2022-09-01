package com.example.demo.Controller;

import com.example.demo.Domain.Exchange;
import com.example.demo.Domain.Stock;
import com.example.demo.Service.ExchangeService;
import com.example.demo.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock")
public class StockController {


    @Autowired
    private StockService stockService;

    @PostMapping("/saveStock")
    ResponseEntity<?> saveStock(@RequestBody Stock stock) {
        return stockService.saveStock(stock);
    }

    @PutMapping("/updateStock")
    ResponseEntity<?> updateStock(@RequestBody Stock stock) {
        return stockService.updateStock(stock);
    }

    @GetMapping("/getAllStock")
    ResponseEntity<?> getAllStock() {
        return stockService.getAllStock();
    }


    @DeleteMapping("/deleteStock/{id}")
    ResponseEntity<?> deleteStock(@PathVariable("id") Long stockId) {
        return stockService.deleteStock(stockId);
    }

    @GetMapping("/getStockBySegment/{id}")
    ResponseEntity<?> getStockBySegment(@PathVariable("id") Long segmentId) {
        return stockService.getStockBySegment(segmentId);
    }

    @GetMapping("/getStockByExchange/{id}")
    ResponseEntity<?> getStockByExchange(@PathVariable("id") Long exchangeId) {
        return stockService.getStockByExchange(exchangeId);
    }

    @GetMapping("/getStockByType/{type}")
    ResponseEntity<?> getStockByType(@PathVariable("type") String type) {
        return stockService.getStockByType(type);
    }

    @GetMapping("/getStockByCountry/{country}")
    ResponseEntity<?> getStockByCountry(@PathVariable("country") String country) {
        return stockService.getStockByCountry(country);
    }

}
