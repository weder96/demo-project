package com.wsousa.demoproject.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_address")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
    @SequenceGenerator(sequenceName = "address_seq", allocationSize = 1, name = "address_seq")
    private Long id;
    private String zip;
    private String url;
    private String complement;
    private String street;
    private String district;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id")
    private CityEntity cityEntity;
}
