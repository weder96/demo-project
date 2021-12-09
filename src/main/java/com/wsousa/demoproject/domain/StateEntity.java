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
@Table(name="tb_state")
public class StateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "state_seq")
    @SequenceGenerator(sequenceName = "state_seq", allocationSize = 1, name = "state_seq")
    private Long id;
    private String name;
}
