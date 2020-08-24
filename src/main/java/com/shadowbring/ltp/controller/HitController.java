package com.shadowbring.ltp.controller;

import com.shadowbring.ltp.domain.Hit;
import com.shadowbring.ltp.repository.HitRepository;
import java.time.LocalDate;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hits")
@RequiredArgsConstructor
public class HitController {

    private final HitRepository hitRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, LocalDate> hitAndReturnDummyData() {
        hitRepository.save(new Hit());
        return Map.of(
                "today", LocalDate.now(),
                "yesterday", LocalDate.now().minusDays(1),
                "tomorrow", LocalDate.now().plusDays(1)
        );
    }
}
