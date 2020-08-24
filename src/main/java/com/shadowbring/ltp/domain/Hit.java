package com.shadowbring.ltp.domain;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Hit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime localDateTime = LocalDateTime.now();
}
