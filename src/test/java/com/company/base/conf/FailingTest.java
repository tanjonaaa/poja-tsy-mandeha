package com.company.base.conf;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FailingTest {

  @Test
  void should_fail() {
    assertTrue(false);
  }
}
