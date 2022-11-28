package com.example.mongospringdemo.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDomain {
    private Integer id;
    private String name;
    private LocalDateTime birthDate;
}
