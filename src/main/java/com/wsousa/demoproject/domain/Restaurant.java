package com.wsousa.demoproject.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="tb_restaurant")
public class Restaurant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "restaurant_seq")
    @SequenceGenerator(sequenceName = "restaurant_seq", allocationSize = 1, name = "restaurant_seq")
    private Long id;

    private String name;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "kitchen_id")
    private KitchenEntity kitchen;
}
