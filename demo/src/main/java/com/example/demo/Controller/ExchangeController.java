package com.example.demo.Controller;

import com.example.demo.Domain.Exchange;
import com.example.demo.Service.ExchangeService;
import com.example.demo.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exchange")
public class ExchangeController {

    @Autowired
    private ExchangeService exchangeService;
    @Autowired
    private StockService stockService;

    @PostMapping("/saveExchange")
        ResponseEntity<?> saveExchange(@RequestBody Exchange exchange){
            return exchangeService.saveExchange(exchange);
        }

    @PutMapping("/updateExchange")
    ResponseEntity<?> updateExchange(@RequestBody Exchange exchange){
        return exchangeService.updateExchange(exchange);
    }

    @GetMapping("/getExchange")
    ResponseEntity<?> getExchange(){
        return exchangeService.getAllExchange();
    }

    @DeleteMapping("/deleteExchange/{id}")
    ResponseEntity<?> deleteExchange(@PathVariable("id") Long exchangeId){
        return exchangeService.deleteExchange(exchangeId);
    }


}
