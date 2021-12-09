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
@Table(name="tb_payment_type")
public class PaymentTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_type_seq")
    @SequenceGenerator(sequenceName = "payment_type_seq", allocationSize = 1, name = "payment_type_seq")
    private Long id;
    private String name;
}
