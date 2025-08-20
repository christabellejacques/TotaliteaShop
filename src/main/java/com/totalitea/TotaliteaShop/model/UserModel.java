package com.totalitea.TotaliteaShop.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table (name="users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;

    private LocalDateTime registeredAt = LocalDateTime.now();

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<OrderModel> orders=new ArrayList<>();
}
