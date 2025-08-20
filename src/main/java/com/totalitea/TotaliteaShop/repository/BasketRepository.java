package com.totalitea.TotaliteaShop.repository;

import com.totalitea.TotaliteaShop.model.BasketModel;
import com.totalitea.TotaliteaShop.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<BasketModel, Long> {
}
