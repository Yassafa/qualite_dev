package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {
    private Voiture car;

    @BeforeEach
    void setup() {
        this.car = new Voiture("Porshe", 9999999);
    }

    @Test
    void creerVoiture(){
        assertEquals(1,1);
    }

}
