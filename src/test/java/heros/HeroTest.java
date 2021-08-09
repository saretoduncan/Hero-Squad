package heros;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    void nameGetter() {
        Hero hero= new Hero("spiderman", 25, "spider powers");
        assertEquals("spiderman", hero.getName());
        assertEquals(25, hero.getAge());
        assertEquals("spider powers", hero.getSpecialPower());
    }
}