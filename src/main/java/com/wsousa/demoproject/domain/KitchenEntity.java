package com.wsousa.demoproject.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_kitchen")
public class KitchenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kitchen_seq")
    @SequenceGenerator(sequenceName = "kitchen_seq", allocationSize = 1, name = "kitchen_seq")
    private Long id;

    private String name;

    @JsonIgnore
    @OneToOne(mappedBy="kitchen")
    private RestaurantEntity restaurant;

}
