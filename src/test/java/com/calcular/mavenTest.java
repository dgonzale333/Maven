package com.calcular;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mavenTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void suma() {
        maven Maven = new maven();
        assertEquals(5,maven.suma(2,3));
    }

    @Test
    void resta() {
        maven Maven = new maven();
        assertEquals(5,maven.resta(7,2));
    }
}