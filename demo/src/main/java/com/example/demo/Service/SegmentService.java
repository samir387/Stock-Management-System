package com.example.demo.Service;


import com.example.demo.Domain.Segments;
import com.example.demo.Repository.SegmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;

@Service
public class SegmentService {

    @Autowired
    private SegmentRepository segmentRepository;


    public ResponseEntity<?>saveSegment(Segments segment){
         segmentRepository.save(segment);
         return new ResponseEntity<>("segment saved.", HttpStatus.OK);
    }

    public ResponseEntity<?>updateSegment(Segments segment){
//        Segments segment1 = segmentRepository.findById(segment.getSegmentId()).get();
//        segment1.setEndTime(segment.getEndTime());
//        segment1.setEndTime(segment.getEndTime());
//        segment1.setWorkingDay(segment.getWorkingDay());
        segmentRepository.save(segment);
        return new ResponseEntity<>("segment update successfully",HttpStatus.OK);
    }
    public ResponseEntity<?>deleteSegment(Long segmentId){
        segmentRepository.deleteById(segmentId);
        return new ResponseEntity<>("segment deleted.",HttpStatus.OK);
    }
    public ResponseEntity<?>getAllSegment(){
        return  new ResponseEntity<>( segmentRepository.findAll(),HttpStatus.OK);
    }
}
