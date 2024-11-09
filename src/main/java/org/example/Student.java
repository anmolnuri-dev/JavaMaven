package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Student {

    private int id;
    private String name;
    private String email;
    private String department;
}
