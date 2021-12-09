package com.wsousa.demoproject.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
    @SequenceGenerator(sequenceName = "product_seq", allocationSize = 1, name = "product_seq")
    private Long id;
    private String name;
    private String description;
    private BigDecimal value;
    private Boolean status;
}
