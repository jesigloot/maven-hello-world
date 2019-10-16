package se.jsimo.hello;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class helloTest {

  @Test
  void verifyHelloReturnsAString() {
    assertNotNull(Hello.getHelloString());
  }
}
