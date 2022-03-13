package com.manager.app.entities.concrete;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;

    @Column
    String surName;

    @Column
    String role;

    @Column
    int age;

    @Column
    double salary;

    @Column
    String imgUrl;

    @ManyToOne
    @JoinColumn(name = "marketId")
    private Market market;

}
