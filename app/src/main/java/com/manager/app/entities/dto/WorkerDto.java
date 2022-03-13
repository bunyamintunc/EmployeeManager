package com.manager.app.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WorkerDto {
    Long id;
    String name;
    String surName;
    String role;
    int age;
    double salary;
    String imgUrl;
    long marketId;
}
