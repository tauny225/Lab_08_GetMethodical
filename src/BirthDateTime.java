import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHours = 0;
        int birthMinutes = 0;
        birthYear = SafeInput.getRangedint(in, "Enter your birth year ", 1950, 2010);
        birthMonth = SafeInput.getRangedint(in, "Enter your birth month ", 1, 12);
        birthDay = SafeInput.getRangedint(in, "Enter your birth day ", 1, 31);
        birthHours = SafeInput.getRangedint(in, "Enter your birth hours ", 1, 24);
        birthMinutes = SafeInput.getRangedint(in, "Enter your birth minutes ", 1, 59);
        System.out.println("Birth year is " + birthYear);
        System.out.println("Birth month is " + birthMonth);
        System.out.println("Birth day is " + birthDay);
        System.out.println("Birht hours is " + birthHours);
        System.out.println("Birht minutes is " + birthMinutes);
    }
}
