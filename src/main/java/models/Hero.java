package models;

import java.util.ArrayList;

public class Hero {
    private String name;
    private  int age;
    private String specialPower;
    private int id;
    private String weakness;
    private static ArrayList<Hero> ninjaInstance=  new ArrayList<>();

    public Hero(String name,int age , String specialPower,String weakness){
        this.name= name;
        this.age= age ;
        this.weakness= weakness;
        this.specialPower=specialPower;
        ninjaInstance.add(this);
        this.id= ninjaInstance.size();
    }
    public String getName(){
        return name;
    }
    public String getWeakness(){
        return weakness;
    }
    public  int getAge(){
        return age;
    }
    public  String  getSpecialPower(){
        return specialPower;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public static   ArrayList<Hero> getNinjaInstance(){
        return ninjaInstance;
    }
    public static void clearNinjaInstance(){
        ninjaInstance.clear();
    }
    public  static void deleteHeroNinjaInstance(int id){
        ninjaInstance.remove(id-1);
    }


}
