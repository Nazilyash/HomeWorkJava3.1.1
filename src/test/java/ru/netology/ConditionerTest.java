package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource(
            value = {"24, 23",
                    "30, 30",
                    "30, 31"
            }
    )
    public void shouldIncreaseCurrentTemperature(int expectedCurrentTemperature, int currentTemperature) {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expectedCurrentTemperature, conditioner.getCurrentTemperature());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"22, 23",
                    "16, 16",
                    "16, 15"
            }
    )
    public void shouldDecreaseCurrentTemperature(int expectedCurrentTemperature, int currentTemperature) {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expectedCurrentTemperature, conditioner.getCurrentTemperature());
    }

}