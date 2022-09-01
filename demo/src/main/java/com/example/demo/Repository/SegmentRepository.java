package com.example.demo.Repository;

import com.example.demo.Domain.Segments;
import com.example.demo.Domain.Segments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SegmentRepository extends JpaRepository<Segments,Long> {
}
