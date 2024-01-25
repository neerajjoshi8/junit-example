package com.example.controller;

import com.example.dto.PersonDto;
import com.example.entity.Person;
import com.example.service.ProductService;
import com.example.validator.RequestValidator;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/v1/api")
@AllArgsConstructor
public class PersonController {

  private final ProductService productService;

  @GetMapping(
      value = "/persons",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<PersonDto>> getAllPersons() {
    RequestValidator.validateGetAllPersonRequest();
    List<PersonDto> persons = productService.getAllPersons();
    return ResponseEntity.ok(persons);
  }

  @PostMapping(
      value = "/person"
  )
  public ResponseEntity<PersonDto>

}
