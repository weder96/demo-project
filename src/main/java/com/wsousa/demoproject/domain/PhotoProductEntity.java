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
@Table(name="tb_photo_product")
public class PhotoProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "photo_product_seq")
    @SequenceGenerator(sequenceName = "photo_product_seq", allocationSize = 1, name = "photo_product_seq")
    private Long id;
    private String nameFile;
    private String url;
    private String contentType;
    private Long lengthFile;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;

}
