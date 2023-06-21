package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table
@RequiredArgsConstructor
@Getter
@Setter
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GENDER_ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;
}
