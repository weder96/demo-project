package com.wsousa.demoproject.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_permission")
public class PermissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "permission_seq")
    @SequenceGenerator(sequenceName = "permission_seq", allocationSize = 1, name = "permission_seq")
    private Long id;
    private String name;
    private String description;

    @ManyToMany
    @JoinTable(
            name = "rel_group_permission",
            joinColumns = @JoinColumn(name = "group_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id"))
    Set<UserEntity> users;


}
