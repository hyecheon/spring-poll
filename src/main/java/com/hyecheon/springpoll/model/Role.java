package com.hyecheon.springpoll.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

/**
 * Project : spring-poll
 * Created by IntelliJ IDEA
 * Developer : 이혜천
 * Date : 2018-04-23
 * Time : 오전 12:05
 * Email : ihyecheon@gmail.com
 */
@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
public class Role {
    public Role(RoleName name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName name;
}
