package com.mingati.kikundi.base;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseBo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    @Column(name = "date_created")
    protected LocalDateTime dateCreated= LocalDateTime.now();

}
