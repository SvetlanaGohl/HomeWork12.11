public class Main {
    public static void printYear(int leapYear) {
        if (leapYear % 4 == 0 && leapYear % 100 != 00 || leapYear % 400 == 0) {
            System.out.println(leapYear + " год является високосным.");
    } else {
            System.out.println(leapYear + " год неявляется високосным.");
        }
    }
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {

        System.out.println("ЗАДАЧА 1");
        int year = 2021;
        printYear(year);
    }
    public static void task2() {

        System.out.println("ЗАДАЧА 2");
}
