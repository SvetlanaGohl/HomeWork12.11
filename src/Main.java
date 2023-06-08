import java.time.LocalDate;

public class Main {
    public static void printYear(int leapYear) {
        if (leapYear % 4 == 0 && leapYear % 100 != 00 || leapYear % 400 == 0) {
            System.out.println(leapYear + " год является високосным.");
    } else {
            System.out.println(leapYear + " год неявляется високосным.");
        }
    }

    public static void setPhoneVersion (int clientOS, int clientYear ) {
        int currentYear = LocalDate.now().getYear();
        int ios = 0;
        int android = 1;
        int clientDeviceYear = 2015;
        if (clientOS == ios) {
            if (clientYear >= clientDeviceYear) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке...");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке...");
            }
        } else if (clientOS == android) {
            if (clientYear >= clientDeviceYear) {
                System.out.println("Установите обычную версию приложения для Android по ссылке...");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке...");
            }
        } else {
                System.out.println("Данная операционная система не поддерживается.");
            }
    }

    public static int countDeliveryDays (int distance) {
        int deliveryDays = -1;
        int day = 0;
        if (distance <= 20){
            deliveryDays = day + 1;
        } else if (distance <= 60) {
            deliveryDays = day + 2;
        } else if (distance <= 100) {
            deliveryDays = day + 3;
        }
        return deliveryDays;

    }
    public static void printDeliveryDays (int deliveryDays) {
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет.");
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {

        System.out.println("ЗАДАЧА 1");
        int year = 2021;
        printYear(year);
    }
    public static void task2() {

        System.out.println("ЗАДАЧА 2");
        setPhoneVersion( 1, 2016);

    }
    public static void task3() {

        System.out.println("ЗАДАЧА 3");
        int deliveryDays = countDeliveryDays(101);
        printDeliveryDays(deliveryDays);
    }
}