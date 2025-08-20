package com.totalitea.TotaliteaShop.repository;

import com.totalitea.TotaliteaShop.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
}
