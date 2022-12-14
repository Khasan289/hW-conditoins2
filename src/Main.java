public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        // task 1
        System.out.println("Задача 1");
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static void task2() {
        // task 2
        System.out.println("Задача 2");
        int clientOs = 0;
        int clientDeviceYear = 2012;
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2022;
        if (year%4 == 0 && year%100!= 0 || year%400 == 0){
            System.out.println("Год " + year + " високосный.");
        }else {
            System.out.println("Год " + year + " не високосный.");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance >= 0 && deliveryDistance <= 20){
            days = 1;
            System.out.println("Потребуется " + days + " дней.");
        } else if (deliveryDistance > 20 && deliveryDistance<=60) {
            days = days + 1;
            System.out.println("Потребуется " + days + " дней.");
            
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = days + 2;
            System.out.println("Потребуется " + days + " дня.");
            
        }else {
            System.out.println("Доставки нет.");
        }

    }
    public static void task5(){
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber +"-это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-это осень");
                break;
            default:
                System.out.println("Нет такого месяца, под номером "+ monthNumber);


        }
    }
    }
