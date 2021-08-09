package models;

import java.util.ArrayList;

public class Squad {
    private  ArrayList<Hero> arr= new ArrayList<>();
    private String name;
    private String mission;
    private int id;


    private static ArrayList<Squad> sInstance= new ArrayList<>();

    public Squad(String name, String mission){
       this.arr= Hero.getNinjaInstance();
       this.name=name;
       this.mission= mission;
       sInstance.add(this);
       this.id= sInstance.size();



    }

    public ArrayList<Hero> getArr(){
        return  arr;
    }
    public  String getName(){
        return name;
    }

    public String getMission() {
        return mission;
    }
    public int id(){
        return id;
    }
    public  static ArrayList<Squad> getsInstance(){
        return sInstance;
    }
    public static void clearAllInstances(){
         sInstance.clear();
    }
    public static void delInstance(int id){
        sInstance.remove(id-1);
    }
}
