package com.example.service.impl;

import com.example.dto.PersonDto;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  @Override
  public List<PersonDto> getAllPersons() {

    return null;
  }
}
