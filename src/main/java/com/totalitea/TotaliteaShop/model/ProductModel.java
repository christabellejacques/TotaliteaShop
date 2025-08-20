package com.totalitea.TotaliteaShop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String supplier;
    private String name;
    private String type;
    private int amountInGrams;
    private double price;

    private String brewColour;
    private String medicinalUse;

    private int caffeineMg;

    private Integer gramsPerCup;
}
