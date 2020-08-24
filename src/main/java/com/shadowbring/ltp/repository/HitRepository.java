package com.shadowbring.ltp.repository;

import com.shadowbring.ltp.domain.Hit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HitRepository extends JpaRepository<Hit, Long> {
}
