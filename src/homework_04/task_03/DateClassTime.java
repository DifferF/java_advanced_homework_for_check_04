package homework_04.task_03;

/*
Задание 3+
Спроектируйте и разработайте метод, определяющий, сколько времени прошло с заданной даты.
С помощью этого методы выведите в консоль,
сколько времени прошло с вашего дня рождения в удобном для восприятия виде,
например: «Вам исполнилось 20 лет, 3 месяца, 18 дней, 4 часа, 5 минут и 10 секунд».
 */

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateClassTime {

    public static void main(String[] args) throws ParseException {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse("15.05.1955", formatter);
        LocalDateTime dateNow = LocalDateTime.now();
        Period period = Period.between(startDate, LocalDate.from(dateNow));
        System.out.println("Полных Лет |" + period.getYears());
        System.out.println("Полных Месяцев |" + period.getMonths());
        System.out.println("Дней |" + period.getDays());
        System.out.println("Часов |" + dateNow.getHour());
        System.out.println("Минут |" + dateNow.getMinute());
        System.out.println("Секунд |" + dateNow.getSecond());
    }
}
