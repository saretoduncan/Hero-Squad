package models;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {

    @Test
    void name() {
        Squad.clearAllInstances();
        Squad na= new Squad("super","kill");
        Hero ne = new Hero("spiderman",30, "spider","sympathy");
        assertEquals("spiderman",na.getArr().get(0).getName());
        assertEquals(30,na.getArr().get(0).getAge());
        assertEquals("spider",na.getArr().get(0).getSpecialPower());
        assertEquals("sympathy",na.getArr().get(0).getWeakness());
    }

    @Test
    void getters() {
        Squad.clearAllInstances();
        Squad na= new Squad("super","kill");
        assertEquals("super", na.getName());
        assertEquals("kill", na.getMission());
    }
    @Test
    void sInstance_true() {
        Squad.clearAllInstances();
        Squad na= new Squad("super","kill");
        ArrayList<Squad> sq= new ArrayList<>();
        sq.add(na);
        assertEquals(sq,Squad.getsInstance());

    }

    @Test
    void id_instance_true() {
        Squad.clearAllInstances();
        Squad na= new Squad("super","kill"); Squad naw= new Squad("super","kill");
        ArrayList<Squad> sq= new ArrayList<>();
        sq.add(na);
        sq.add(naw);
        assertEquals(1,na.id());  assertEquals(2,naw.id());
    }
    @Test
    void delete_item_sInstance(){
        Squad.clearAllInstances();
        Squad na= new Squad("super","kill");
        Squad naw= new Squad("super","kill");
        ArrayList<Squad> sq= new ArrayList<>();
        sq.add(na);
        sq.add(naw);
        int k= sq.size();
        sq.remove(naw.id()-1);
        assertNotEquals(k,sq.size());

    }
}