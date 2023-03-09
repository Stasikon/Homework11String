import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        String firstName = " Петр";
        String middleName = " Витальевич";
        String lastName  = " Шольц";
        String fullName = "ФИО сотрудника- ";
        fullName = fullName+lastName+firstName+ middleName;
        System.out.println(fullName);

    }

    public static void task2() {
        String firstName = " pol";
        String middleName = " oplomin";
        String lastName  = " sholc";
        String fullName = "ФИО сотрудника- ";
        fullName = fullName+lastName+firstName+ middleName;
        String small = fullName;
        System.out.println(fullName.toUpperCase());

    }

    public static void task3(){
        String firstName = " Семён";
        String middleName = " Иванов";
        String lastName  = " Семёнович";
        String fullName = "ФИО сотрудника-";
        fullName = fullName+lastName+firstName+ middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);


    }

}
