package com.totalitea.TotaliteaShop.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime orderDate = LocalDateTime.now();

    private double totalPrice;
    private double shippingCost;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private UserModel user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItemModel> items = new ArrayList<>();
}
