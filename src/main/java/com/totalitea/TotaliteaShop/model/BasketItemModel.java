package com.totalitea.TotaliteaShop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "basket_items")
public class BasketItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "proudct_id")
    private ProductModel proudct;

    @ManyToOne
    @JoinColumn(name = "basket_id")
    private BasketModel basket;
}
