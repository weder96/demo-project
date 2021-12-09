package com.wsousa.demoproject.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_ordered")
public class OrderedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ordered_seq")
    @SequenceGenerator(sequenceName = "ordered_seq", allocationSize = 1, name = "ordered_seq")
    private Long id;
    private BigDecimal  subTotal;
    private BigDecimal freight;
    private BigDecimal totalValue;
    private LocalDateTime dateCreate;
    private LocalDateTime dateDelivery;
    private LocalDateTime dateCancel;
    private LocalDateTime dateConfirmed;
    private String status;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "restaurant_id")
    private RestaurantEntity restaurant;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_type_id")
    private PaymentTypeEntity paymentType;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private AddressEntity address;

    @ManyToMany
    @JoinTable(
            name = "rel_ordered_itens",
            joinColumns = @JoinColumn(name = "ordered_id"),
            inverseJoinColumns = @JoinColumn(name = "ordered_item_id"))
    Set<OrderedItemEntity> itens;
}
