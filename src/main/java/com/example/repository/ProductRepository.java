package com.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository {
  void findAll();
}
