package models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    void nameGetter() {
        Hero hero= new Hero("spiderman", 25, "spider powers","sympathy");
        assertEquals("spiderman", hero.getName());
        assertEquals(25, hero.getAge());
        assertEquals("spider powers", hero.getSpecialPower());
        assertEquals("sympathy", hero.getWeakness());
    }


}