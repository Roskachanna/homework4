import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он достиг совершенолетия");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int atmosphericTemperature = 3;
        if (atmosphericTemperature >= 5) {
            System.out.println("На улице " + atmosphericTemperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + atmosphericTemperature + " градусов, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 58;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 28;
        if (age >= 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университкъет.");
        }
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 28;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься. ");
        } else if (age >5 && age <=14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. ");
        } else if (age >14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого.");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int quantityTotal = 102;
        int quantitySitting = 60;
        int quantityStanding = (quantityTotal - quantitySitting);

        int seatSitting = 18;
        int seatStanding = 23;

        if (quantitySitting>seatSitting) {
            System.out.println("Сидячих мест осталось " + (quantitySitting - seatSitting));
        } else {
            System.out.println("Сидячих мест нет ");
        }
        if (quantityStanding>seatStanding) {
            System.out.println("Стоячих мест осталось " + (quantityStanding - seatStanding));
        } else {
            System.out.println("Стоячих мест нет ");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 3;
        int two = 4;
        int three = 2;
        if (one > two) {
            if (one >= three) {
                System.out.println("Больше значение " + one);
            } else {
                System.out.println("Больщее значение " + three);
            }
        } else if (two > one) {
            if (two >= one) {
                System.out.println("Большее значение " + two);
            } else {
                System.out.println("Большее значение " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Большее значение " + one);
            } else if (three > one) {
                System.out.println("Большее значение " + three);
            } else {
                System.out.println("Значения равны ");
            }
        }
    }
}