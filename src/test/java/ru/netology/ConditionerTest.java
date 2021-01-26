package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
@Test
public void shouldGetAndSet() {
    Conditioner conditioner = new Conditioner();
    String expected = "Кондишн";

    assertNull(conditioner.getName());
    conditioner.setName(expected);
    assertEquals(expected, conditioner.getName());
}
}