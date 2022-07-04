package com.example.examenfinalfas.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "applications")
public class ApplicationEntity {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long id;
    private boolean flight;
    private boolean hotel;
    private boolean rent;
    private boolean moving;
    private Long worker_id;
}
