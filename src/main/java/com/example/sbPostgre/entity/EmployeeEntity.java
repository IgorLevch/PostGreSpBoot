package com.example.sbPostgre.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Data
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity implements Serializable {



    private static final long serialVersionUID = 1L;    // работает и без Serializable

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name="positio")
    private String positio;

    @Column(name = "salary")
    private Double salary;

}
