package udemOOPS;

public class Boy {
    String sex;
    int age;
    String race;
    int walk;
    Boy(String sex, int age, String race ){
        this.sex = sex;
        this.age = age;
        this.race = race;
    }
    protected void boyWalk(){
        walk++;
        System.out.println("First boy walks");
        System.out.println("The boy is a " + race + " who is " + age +  "years old");
    }
}
