package packageone;

public class StringDemo {
    public static void main(String[] args) {

        String str1 = "Linux,Penguin,Mint";
        String str2 = "Guru";
        String str3 = str1 + str2; //Created a new object called LinuxGuru
        String str4 = str3.substring(2, 5);//This should print nux
//        System.out.println(str4);
        String str5 = "I love Java";
        System.out.println(str5.substring(7,10));

    }
}
