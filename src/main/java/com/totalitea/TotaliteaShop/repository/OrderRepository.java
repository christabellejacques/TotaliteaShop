package com.totalitea.TotaliteaShop.repository;

import com.totalitea.TotaliteaShop.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel, Long> {
}
