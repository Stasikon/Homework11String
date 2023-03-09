import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lesson1();
        lesson2();
        lesson3();
        task1();
        task2();
        task3();

    }

    public static void lesson1() {
        String phone = "9604157537";
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Teлефон слишком короткий");
        }
        System.out.println("phone = " + phone);
    }

    public static void lesson2() {
        String phone = "+960-415-75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
//            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторнний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Не удача");
        }


    }
    public static void lesson3(){
        int age = 12;
        String name = "Java-master";
        if (age <18) {
            System.out.println(name+" this page in adults only");
        }else {
            System.out.println("Welcome to the application "+ name);
        }
    }
    public static void lesson4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter your name");
        String name = scanner.next();
        if(age < 18){
            System.out.println(name+" this page in adults only");
        }else {
            System.out.println("Welcome to the application "+ name);
        }
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
        String fullName = "ФИО сотрудника- ";
        fullName = fullName+lastName+firstName+ middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);


    }

}
