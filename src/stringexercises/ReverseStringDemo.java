package stringexercises;

public class ReverseStringDemo {
    //Reverse the string order from "this is a test string"
    //to "string test a is this"
    public static void main(String[] args) {
        String st = "this is a test string";
        String [] st1 = st.split("\\s+"); // \
            for(int j = st1.length-1; j >= 0; j--){
                System.out.print(st1[j] + " ");
            }
        }
    }



