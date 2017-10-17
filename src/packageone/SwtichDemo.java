package packageone;

import java.util.Scanner;

public class SwtichDemo {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
        System.out.print("Enter your birth year : ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Enter your birth month : ");
        String month = input.nextLine();
        int result = numOfDays(year,month);
    }

    static int numOfDays(int year, String month){
        int num = 0;
        month = month.toLowerCase();
        String mnth = month.substring(0,3);
        switch(mnth){
            case "jan": //case means if month = 1; switch = case
                System.out.println("You are Auqarius");
                break;
            case "feb":
                /*if(year%400 == 0){
                    num = 29;
                }else{
                    num = 28;
                }*/
                System.out.println("You are Pisces  ");
                break;
            case "mar" :
                System.out.println("You are Aries");
                break;
            case "apr" :
                System.out.println("You are Taurus");
                break;
            case "may" :
                System.out.println("You are Gemini");
                break;
            case "jun" :
                System.out.println("You are Cancer");
                break;
            case "jul" :
                System.out.println("You are Leo");
                break;
            case "aug" :
                System.out.println("You are Virgo");
                break;
            case "sep" :
                System.out.println("You are Libra");
                break;
            case "oct" :
                System.out.println("You are Scorpio");
                break;
            case "nov" :
                System.out.println("You are Sagitarius");
                break;
            case "dec" :
                System.out.println("You are Capricorn");
                break;
            default :
                System.out.println("Invalid Month");
                break;
        }
        return num;
    }
}
