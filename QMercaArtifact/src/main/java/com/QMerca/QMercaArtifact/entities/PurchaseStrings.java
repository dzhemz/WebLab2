package com.QMerca.QMercaArtifact.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@NoArgsConstructor
public class PurchaseStrings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


}
