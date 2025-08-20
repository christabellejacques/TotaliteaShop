package com.totalitea.TotaliteaShop.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="baskets")

public class BasketModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserModel user;

    @OneToMany(mappedBy = "basket", cascade = CascadeType.ALL)
    private List<BasketItemModel> items = new ArrayList<>();

}
