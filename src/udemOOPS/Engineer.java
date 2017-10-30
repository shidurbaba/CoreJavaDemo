package udemOOPS;

public class Engineer extends Man{
    String occupation;
    private String Education = "Harvard University";

   Engineer(String sex, int age, String race, String occupation){
       super(sex, age, race);
       this.occupation = occupation;
   }

   public String getEducation(){
        return Education;
   }

   protected void walkEngineer(){
       super.manWalk(); //From parent class Man
       Boy youngBoy = new Boy("male",12, "White Boy");
       youngBoy.boyWalk();
       System.out.print("This is Alan Turing" +
               "\n"+ "He is " + race +" "+ sex + " and " + "he is " + age +" years old " + "\n"
       + "He is an " + occupation + "\n");
   }

}
