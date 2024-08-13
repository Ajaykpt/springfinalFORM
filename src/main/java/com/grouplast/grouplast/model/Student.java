package com.grouplast.grouplast.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int r;
    String name;

}
