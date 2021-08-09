package heros;

public class Hero {
    private String name;
    private  int age;
    private String specialPower;
    private int id;
    public Hero(String name,int age , String specialPower){
        this.name= name;
        this.age= age ;
        this.specialPower=specialPower;
    }
    public String getName(){
        return name;
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
}
