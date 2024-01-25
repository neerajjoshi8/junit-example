package com.example.validator;

import com.example.dto.PersonDto;
import io.micrometer.common.util.StringUtils;

public class RequestValidator {

  public static final int MAX_NAME_LENGTH = 30;

  public static void validateGetAllPersonRequest(PersonDto personDto) {
    validatePersonName(personDto.name());
    validatePersonAge(personDto.age());
  }

  private static void validatePersonName(String name) {
    if (StringUtils.isBlank(name)) {
      throw new RuntimeException("Person name is blank or null");
    }

    if (name.length() > MAX_NAME_LENGTH) {
      throw new RuntimeException(String.format("Person name cannot be more than %s characters",
          MAX_NAME_LENGTH));
    }
  }
  private static void validatePersonAge(int age) {
    if (isNumberNegative(age)) {
      throw new RuntimeException("Age cannot be negative");
    }
  }

  private static boolean isNumberNegative(int age) {
    return age < 0;
  }
}
