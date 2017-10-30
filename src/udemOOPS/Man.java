package udemOOPS;

public class Man {
    String sex;
    int age;
    String race;
    int walk;
    protected String power1 ;
    protected String power2;
    public Man(){}
    public Man(String sex, int age, String race ){
        this.sex = sex;
        this.age = age;
        this.race = race;
    }
    protected void manWalk(){
        walk++;
        System.out.println("First man walks");
    }
}
