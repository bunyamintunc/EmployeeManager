package com.manager.app.entities.concrete;

import lombok.*;
import org.hibernate.jdbc.Work;
import org.hibernate.mapping.Map;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Market {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private  Long marketId;

    @Column
    private String name;

    @Column
    private String adres;

    @Column
    private String imgUrl;



}
