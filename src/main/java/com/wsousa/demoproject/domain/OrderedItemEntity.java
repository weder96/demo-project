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
@Table(name="tb_ordered_item")
public class OrderedItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ordered_item_seq")
    @SequenceGenerator(sequenceName = "ordered_item_seq", allocationSize = 1, name = "ordered_item_seq")
    private Long id;
    private int quantity;
    private BigDecimal priceUnit;
    private BigDecimal priceTotal;
    private String observations;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "ordered_id")
    private OrderedEntity ordered;
}
