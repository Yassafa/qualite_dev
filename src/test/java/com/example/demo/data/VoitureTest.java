package com.example.demo.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class VoitureTest {

    private Voiture car;

    // Configuration avant chaque test
    @BeforeEach
    void setup() {
        this.car = new Voiture("Porsche", 9999999);
    }

    @Test
    void testConstructor() {
        assertEquals("Porsche", car.getMarque(), "La marque est bien initialisée");
        assertNotEquals("BMW", car.getMarque(), "Le constructeur n'a pas correctement initialisé la marque");
    }

    @Test
    void testSetId() {
        car.setId(1);
        assertEquals(1, car.getId(), "L'ID est correctement mis à jour");
        assertNotEquals(2, car.getId(), "L'ID n'est pas mis à jour correctement");
    }

    @Test
    void testGetMarque() {
        assertEquals("Porsche", car.getMarque(), "getMarque retourne la bonne valeur");
        assertNotEquals("Toyota", car.getMarque(), "getMarque retourne une mauvaise valeur");
    }

    @Test
    void testSetMarque() {
        car.setMarque("BMW");
        assertEquals("BMW", car.getMarque(), "setMarque a bien mis à jour la marque");
        assertNotEquals("Porsche", car.getMarque(), "setMarque n'a pas mis à jour la marque correctement");
    }

    @Test
    void testGetPrix() {
        assertEquals(9999999, car.getPrix(), "getPrix retourne le bon prix");
        assertNotEquals(1234, car.getPrix(), "getPrix retourne une mauvaise valeur");
    }

    @Test
    void testSetPrix() {
        car.setPrix(5000000);
        assertEquals(5000000, car.getPrix(), "setPrix a bien mis à jour le prix");
        assertNotEquals(9999999, car.getPrix(), "setPrix n'a pas mis à jour correctement le prix");
    }

    @Test
    void testToString() {
        String expected = "Car{marque='Porsche', prix=9999999, id=0}";
        assertEquals(expected, car.toString(), "toString retourne la chaîne attendue");
        assertNotEquals("Car{marque='BMW', prix=123456, id=1}", car.toString(), "toString retourne une chaîne incorrecte");
    }

    @Test
    void testDefaultConstructor() {
        Voiture defaultCar = new Voiture();
        assertEquals(0, defaultCar.getId(), "L'ID par défaut est bien 0");
        assertNotEquals(999, defaultCar.getId(), "L'ID par défaut est incorrect");
    }

    @Test
    void testSetterAndGetterForId() {
        car.setId(101);
        assertEquals(101, car.getId(), "L'ID est correctement défini et retourné");
        assertNotEquals(100, car.getId(), "Le getter pour l'ID retourne une mauvaise valeur");
    }
}
