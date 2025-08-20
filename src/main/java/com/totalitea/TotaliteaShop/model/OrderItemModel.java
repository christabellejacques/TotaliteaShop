package com.totalitea.TotaliteaShop.model;

import jakarta.persistence.*;

@Entity
@Table(name ="order_items")

public class OrderItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;
    private double price;

    @ManyToOne
    @JoinColumn(name="product_id")
    private ProductModel product;

    @ManyToOne
    @JoinColumn(name="order_id")
    private OrderModel order;
}
