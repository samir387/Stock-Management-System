package com.example.demo.Controller;

import com.example.demo.Domain.Exchange;
import com.example.demo.Domain.Segments;
import com.example.demo.Service.ExchangeService;
import com.example.demo.Service.SegmentService;
import com.example.demo.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/segment")
public class SegmentController {

    @Autowired
    SegmentService segmentService;

    @PostMapping("/saveSegments")
    ResponseEntity<?> saveSegments(@RequestBody Segments segments) {
        return segmentService.saveSegment(segments);
    }

    @PutMapping("/updateSegment")
    ResponseEntity<?> updateSegment(@RequestBody Segments segments) {
        return segmentService.updateSegment(segments);
    }

    @GetMapping("/getAllSegment")
    ResponseEntity<?> getAllSegment() {
        return segmentService.getAllSegment();
    }

    @DeleteMapping("/deleteSegment/{id}")
    ResponseEntity<?> deleteSegment(@PathVariable("id") Long segmentId) {
        return segmentService.deleteSegment(segmentId);
    }


}
