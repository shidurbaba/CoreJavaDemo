package stringexercises;

public class ReverseStringDemo2 {
    public static void main(String[] args) {
        String input = "this is a string";
        String output = reverse(input);
        System.out.print(output);
    }
    private static String reverse(String input){
        String reverse = "";
        if((input == null)||(input.isEmpty())){
            System.out.println("Enter valid input");
        }else if(input.length()<=1){
            reverse = input;
        }else{
            String [] originalArray = input.split("\\s+");
            for(String item : originalArray){
                reverse = item +" "+reverse;//        , a + is this  ,is + this ,this + ""
            }
        }
        return reverse.trim();
    }
}
