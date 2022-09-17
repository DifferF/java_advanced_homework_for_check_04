package homework_04.task_04;


/*
Задание+
Напишите консольное приложение, позволяющие пользователю зарегистрироваться под «Логином»,
состоящем только из символов латинского алфавита, и пароля, состоящего из цифр и символов.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginPas {

    private static String login;
    private static String Pass;
    private static Scanner scan;
    private static Pattern loginP = Pattern.compile("[a-zA-Z]{1,5}"); // логин
    private static Pattern passP = Pattern.compile("[a-zA-Zа-яА-Я0-9_()$]{1,5}"); // пасс
    private static Matcher mBoolean;

    public static void main(String[] args) {
        patLog();
    }

    private static void patLog(){
        mBoolean = loginP.matcher(inputLogin());
        if(mBoolean.matches()){ // Соответствует строка шаблону
            patPass();
        } else {
            patLog();
        }
    }

    private static void patPass(){
        mBoolean = passP.matcher(inputPass());
        if(mBoolean.matches()){ // Соответствует строка шаблону
            System.out.println("Логин - " + login);
            System.out.println("Пароль - " + Pass);
        } else {
            patPass();
        }
    }

    private static String inputLogin(){
        System.out.print("Введите логин (только символы латинского алфавита от 1-5) |");
        scan = new Scanner(System.in);
        return login = scan.nextLine();
    }

    private static String inputPass(){
        System.out.print("Введите пароль (состоящего из цифр букв и символов _()$ от 1-5) |");
        scan = new Scanner(System.in);
        return Pass = scan.nextLine();
    }
}
