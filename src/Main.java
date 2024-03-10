public class Main {
    public static void main(String[] args) {
        // Задача 1
        byte clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке\n");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке\n");
                break;
            default:
                System.out.println("Для вашей ОС доступна веб-версия по ссылке\n");
        }

        // Задача 2
        byte clientDeviceOS = 1;
        int clientDeviceYear = 2021;
        if (clientDeviceOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке\n");
            }
        } else if (clientDeviceOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке\n");
            }
        } else {
            System.out.println("Для вашей ОС доступна веб-версия по ссылке\n");
        }

        // Задача 3
        int year = 1924;
        String yearInfo = year + " ";
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            isLeapYear = true;
            if (year % 100 == 0) {
                isLeapYear = false;
            }
            if (year % 400 == 0) {
                isLeapYear = true;
            }
        }
        yearInfo += isLeapYear ? "год является високосным" : "год не является високосным";
        System.out.println(yearInfo);
    }
}