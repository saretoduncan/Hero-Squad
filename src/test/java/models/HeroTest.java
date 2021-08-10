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
@Test
    void ninjaInstance_test_true(){
    Hero hero= new Hero("spiderman", 25, "spider powers","sympathy");
    assertEquals("spiderman", Hero.getNinjaInstance().get(0).getName());
    assertEquals(25, Hero.getNinjaInstance().get(0).getAge());
    assertEquals("spider powers", Hero.getNinjaInstance().get(0).getSpecialPower());
    assertEquals("sympathy", Hero.getNinjaInstance().get(0).getWeakness());

}
@Test
    void deleteNinja_idTest_Instance_true(){
    Hero hero= new Hero("spiderman", 25, "spider powers","sympathy");
    Hero hero1= new Hero("superman",33,"flying", "water");

    Hero.getNinjaInstance().add(hero);
    Hero.getNinjaInstance().add(hero1);
    int heroLength= Hero.getNinjaInstance().size();
    Hero.deleteHeroNinjaInstance(hero1.getId()-1);
    assertNotEquals(heroLength,Hero.getNinjaInstance().size());


}
@Test
    void clearNinjaInstance(){
    Hero hero= new Hero("spiderman", 25, "spider powers","sympathy");
    Hero hero1= new Hero("superman",33,"flying", "water");
    Hero.clearNinjaInstance();
    assertEquals(0,Hero.getNinjaInstance().size());
}


}