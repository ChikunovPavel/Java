package coreLevel2.Introduction.practice;

/**
 * 1 Создать класс, описывающий промежуток времени.
 *   Сам промежуток времени должен задаваться тремя свойствами:
 *   секундами, минутами и часами.
 *   Создать метод для получения полного количесва секунд в обьекте
 *   Создать два конструктора: первый принимает общее количество
 *   секунд, второй - часы, минуты и секунды по отдельности.
 *   Создать метод для вывода данных.
 */

public class TimeIntervalRuner {
    public static void main(String[] args) {
        TimeInterval timeInterval = createTimeInterval();


        TimeInterval timeInterval1 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval1.totalSeconds());
        timeInterval1.print();

        TimeInterval sumInterval = timeInterval.sum(timeInterval1);
        sumInterval.print();

        createTimeInterval();

    }

    private static TimeInterval createTimeInterval() {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        System.out.println(timeInterval.totalSeconds());
        return timeInterval;
    }

}
